package br.com.abc.javacore.concorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest {
    public static void main(String[] args) throws InterruptedException {
        TransferQueue<String> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("André"));
        tq.put("JavaOnline DEVDOJO");
        System.out.println(tq.offer("André"));
        System.out.println(tq.offer("André", 10, TimeUnit.MILLISECONDS));
//        tq.transfer("DevDojo");
        System.out.println(tq.tryTransfer("DevDOJO"));
        System.out.println(tq.tryTransfer("DevDOJO", 1, TimeUnit.SECONDS));

        System.out.println(tq.remainingCapacity());

        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.poll(10, TimeUnit.MILLISECONDS));
        System.out.println(tq.remove());
        System.out.println(tq.take());
    }
}
