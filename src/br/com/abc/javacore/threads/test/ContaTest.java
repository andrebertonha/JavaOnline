package br.com.abc.javacore.threads.test;

import br.com.abc.javacore.threads.classes.Conta;

public class ContaTest implements Runnable {
    private Conta conta = new Conta();

    public static void main(String[] args) {
        ContaTest contaTest = new ContaTest();
        Thread andre = new Thread(contaTest, "André");
        Thread ana = new Thread(contaTest, "Anna");
        andre.start();
        ana.start();
    }

    public static void imprime(){
        synchronized (ContaTest.class) {
            System.out.println("teste");
        }
    }

    private void saque(int valor) {
        synchronized (conta) {

            if (conta.getSaldo() >= valor) {
                System.out.println(Thread.currentThread().getName() + "está indo sacar");
                conta.saque(valor);
                try {
                    //obj so pode ter 1 lock
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " completou o saque, saldo: " + conta.getSaldo());
            } else {
                System.out.println("Sem dinheiro para" + Thread.currentThread().getName() + "efetuar o saque, saldo: " + conta.getSaldo());
            }
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            saque(10);
            if (conta.getSaldo() < 0) {
                System.out.println("oh meu deus");
            }
        }
    }
}
