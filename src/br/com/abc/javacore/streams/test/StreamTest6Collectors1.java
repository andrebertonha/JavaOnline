package br.com.abc.javacore.streams.test;

import br.com.abc.javacore.streams.classes.Pessoa;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class StreamTest6Collectors1 {
    // reducao e sumarizacao de streams em um valor unico
    // agrupamento de elementos aula 192
    // particionamento de elementos 193
    public static void main(String[] args) {
        //contagem
        List<Pessoa> pessoas = Pessoa.bancoDePessoas();
        System.out.println(pessoas.stream().count());
        System.out.println(pessoas.stream().collect(counting()));
        // valor maximo
        Optional<Pessoa> max = pessoas.stream().max(comparing(Pessoa::getSalario));
        System.out.println(max.get().getSalario());
        Optional<Pessoa> collect = pessoas.stream().collect(maxBy(comparing(Pessoa::getSalario)));
        System.out.println(collect.get().getSalario());
        // valor minimo
        Optional<Pessoa> collect1 = pessoas.stream().collect(minBy(comparing(Pessoa::getSalario)));
        System.out.println(collect1.get().getSalario());

        // soma
        System.out.println(pessoas.stream().mapToDouble(Pessoa::getSalario).sum());
        System.out.println(pessoas.stream().collect(Collectors.summingDouble(Pessoa::getSalario)));
        // estatisticas
        DoubleSummaryStatistics collect2 = pessoas.stream().collect(summarizingDouble(Pessoa::getSalario));
        System.out.println(collect2); //.get pega cada uma das estatisticas individualmente

        // media
        System.out.println(pessoas.stream().mapToDouble(Pessoa::getSalario).average());
        System.out.println(pessoas.stream().collect(Collectors.averagingDouble(Pessoa::getSalario)));

        // concatenar
        System.out.println(pessoas.stream().map(Pessoa::getNome).collect(joining(", ")));
    }
}
