package br.com.abc.javacore.concorrencia.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTest {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bq = new ArrayBlockingQueue<String>(1);
        Thread t1 = new Thread(new RemoveFromQueue(bq));
        bq.put("André");
        System.out.println(bq.peek());
        System.out.println("TEntando colocar outro valor");
        t1.start();
        bq.put("Dev DOJO o melhor dojo de TI do Brasil");
        System.out.println("Inserido o ultimo valor");
    }

    static class RemoveFromQueue implements Runnable {

        private BlockingQueue<String> bq;

        public RemoveFromQueue(BlockingQueue<String> bq) {
            this.bq = bq;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " entrando na espera por 2s");
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Removendo o valor " + bq.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
