package br.com.abc.javacore.streamsparalelos;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamParalelos1 {
    public static void main(String[] args) {
        long num = 10_000_000_000L  ;
        somaFor(num);
//        somaStreamIterate(num);
//        somaParallelStreamIterate(num);
        somaRangeClosedStream(num);
        somaRangeClosedParallelStream(num);
        System.out.println("numero de processadores");
        System.out.println(Runtime.getRuntime().availableProcessors());
//        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "12"); // aumentar as threads para o processamento
    }

    private static void somaFor(long num) {
        System.out.println("For");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1L; i <= num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }

    private static void somaStreamIterate(long num) {
        System.out.println("Stream Sequencial");
        long result = 0;
        long init = System.currentTimeMillis();
        result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }

    private static void somaParallelStreamIterate(long num) {
        System.out.println("Stream Paralelos");
        long result = 0;
        long init = System.currentTimeMillis();
        result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }

    private static void somaRangeClosedStream(long num) {
        System.out.println("Range Closed Stream");
        long result = 0;
        long init = System.currentTimeMillis();
        result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }

    //[1,2,3,4,5,6,7,8,9,10]
    //
    private static void somaRangeClosedParallelStream(long num) {
        System.out.println("Range Closed Parallel Stream");
        long result = 0;
        long init = System.currentTimeMillis();
        result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }

    // Aula 194 - Dicas para utilização de Streams Paralelos
    // Benchmark ou medidas de performance, usar stream pararelo, sequencial verificar qual eh melhor
    // Unboxing e o boxing
    // Algumas operacoes sao piores paralelas do que sequenciaais (limit, findFirst) (findAny performance melhor) unordered()
    // Considerar o custo total da computacao dos valores N, P
    // Quantidade de dados se for pequeno sequencial é melhor
    // Tipos de coleções
    // Tamanho do Stream (tamanho definido)
    // Processamento do Merge
    //*
    // if(tarefa    for pequena ou nao pode ser dividida) faz sequencial
    // else dividir em duas tarefas / chamar o metodo recursivamente / esperar todas as tarefas serem completadas / combinar os resultados
    // */
}
