package br.com.abc.javacore.threads.test;

public class DeadLockTest {
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    public static void main(String[] args) {
        new ThreadExemplo1().start();
        new ThreadExemplo2().start();
    }

    public static class ThreadExemplo1 extends Thread {
        public void run(){
            synchronized (lock1) {
                System.out.println("Thread 1: Segurando lock 1");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: esperando pelo lock 2");
                synchronized (lock2){
                    System.out.println("Thread1: segurando lock 1 e lock 2 ");
                }
            }
        }
    }

    public static class ThreadExemplo2 extends Thread {
        public void run(){
            synchronized (lock2) {
                System.out.println("Thread 2: Segurando lock 2");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2: esperando pelo lock 1");
                synchronized (lock1){
                    System.out.println("Thread1: segurando lock 2 e lock 1 ");
                }
            }
        }
    }
}
