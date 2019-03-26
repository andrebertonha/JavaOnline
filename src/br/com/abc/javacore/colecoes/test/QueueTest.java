package br.com.abc.javacore.colecoes.test;

import br.com.abc.javacore.colecoes.classes.Consumidor;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("D");
        queue.add("A");
        queue.add("B");
        queue.add("C");
        System.out.println(queue.remove("B"));
        System.out.println(queue.size());
    }
}
