package br.com.abc.javacore.streams.test;

import br.com.abc.javacore.streams.classes.Genero;
import br.com.abc.javacore.streams.classes.Maioridade;
import br.com.abc.javacore.streams.classes.Pessoa;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamTest6Collectors2 {
    // Agrupamento forma antiga
    public static void main(String[] args) {
        List<Pessoa> pessoas = Pessoa.bancoDePessoas();
        Map<Genero, List<Pessoa>> genoroListMap = new HashMap<>();
        List<Pessoa> masculinos = new ArrayList<>();
        List<Pessoa> femininos = new ArrayList<>();
        for(Pessoa pessoa : pessoas) {
            if(pessoa.getGenero().equals(Genero.FEMININO))
                femininos.add(pessoa);
            else
                masculinos.add(pessoa);
        }
        genoroListMap.put(Genero.FEMININO, femininos);
        genoroListMap.put(Genero.MASCULINO, masculinos);
        System.out.println(genoroListMap);

        // java 8 new way usando apenas uma linha
        // agrupamento por genero
        Map<Genero, List<Pessoa>> collect = pessoas.stream().collect(groupingBy(Pessoa::getGenero));
        System.out.println(collect);

        // agrupar por maioridade
        Map<Maioridade, List<Pessoa>> collect1 = pessoas.stream().collect(groupingBy(p -> {
            if (p.getIdade() < 18) return Maioridade.MENOR;
            else return Maioridade.ADULTO;
        }));
        //nao usar este nome de variavel 'collect1' ou seja, nao usar o nome padrao de introduce local variable, definir um nome intuitivo a ser usado
        System.out.println(collect1);

        // agrupando por genero e maioridade

        Map<Genero, Map<Maioridade, List<Pessoa>>> pessoaGeneroMaioridade = pessoas.stream()
                .collect(groupingBy(Pessoa::getGenero, groupingBy(p -> {
            if (p.getIdade() < 18) return Maioridade.MENOR;
            else return Maioridade.ADULTO;
        })));
        System.out.println(pessoaGeneroMaioridade);

        // agrupando por genero e maioridade
        Map<Genero, Long> collect2 = pessoas.stream().collect(groupingBy(Pessoa::getGenero, Collectors.counting()));
        System.out.println(collect2);

        // agrupando por genero e maior salario
        Map<Genero, Optional<Pessoa>> collect3 = pessoas.stream()
                .collect(groupingBy(Pessoa::getGenero,
                        Collectors.maxBy(Comparator.comparing(Pessoa::getSalario))));
        System.out.println(collect3);
        // agrupando por genero e maior salario sem optional
        Map<Genero, Pessoa> collect4 = pessoas.stream().collect(groupingBy(Pessoa::getGenero,
                collectingAndThen(Collectors.maxBy(Comparator.comparing(Pessoa::getSalario)), Optional::get)));
        System.out.println(collect4);

        // agrupando por genero e estatisticas
        Map<Genero, DoubleSummaryStatistics> collect5 =
                pessoas.stream().collect(groupingBy(Pessoa::getGenero, summarizingDouble(Pessoa::getSalario)));
        System.out.println(collect5); //logica pode ser feito no banco ou na aplicacacao

        // agrupando por genero e maioridade  e verificar se tem feminino maior e menor
        Map<Genero, Set<Maioridade>> collect6 = pessoas.stream().collect(groupingBy(Pessoa::getGenero, mapping(p -> {
            if (p.getIdade() < 18) return Maioridade.MENOR;
            else return Maioridade.ADULTO;
        }, toSet())));
        System.out.println(collect6);

        Map<Genero, Set<Maioridade>> collect7 = pessoas.stream().collect(groupingBy(Pessoa::getGenero, mapping(p -> {
            if (p.getIdade() < 18) return Maioridade.MENOR;
            else return Maioridade.ADULTO;
        }, toCollection(LinkedHashSet::new))));
        System.out.println(collect7);

    }
}
