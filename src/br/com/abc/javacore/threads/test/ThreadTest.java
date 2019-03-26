package br.com.abc.javacore.threads.test;
//Daemon x User
//jvm so termina sua execucao depois que todas threads user forem finalizadas

class ThreadExemplo extends Thread {
    private char c;

    public ThreadExemplo(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println("Thread executando: " + Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }

        }
    }
}

class ThreadExemploRunable implements Runnable {
    private char c;

    public ThreadExemploRunable(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println("Thread executando: " + Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }

            //yield para fazer a thread q esta em execucao voltar ao estado runable
//            Thread.yield();
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {

//        ThreadExemplo t1 = new ThreadExemplo('A');
//        ThreadExemplo t2 = new ThreadExemplo('B');
//        ThreadExemplo t3 = new ThreadExemplo('C');
//        ThreadExemplo t4 = new ThreadExemplo('D');
        Thread t1 = new Thread(new ThreadExemploRunable('A'), "T1");
        Thread t2 = new Thread(new ThreadExemploRunable('B'), "T2");
        Thread t3 = new Thread(new ThreadExemploRunable('C'), "T3");
        Thread t4 = new Thread(new ThreadExemploRunable('D'), "T4");
        //uma vez startada nao pode ser startada denovo, nem quando morre ou termina nao pode ser executada novamente, Somente crinado outro objeto
        t4.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t1.join(); //esperar thread t1 terminar
        t2.start();

//        t3.start();
//        t4.start();
    }
}
