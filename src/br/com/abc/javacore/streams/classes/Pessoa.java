package br.com.abc.javacore.streams.classes;

import java.util.List;
import java.util.Objects;

import static java.util.Arrays.asList;

public class Pessoa {
    private String nome;
    private int idade;
    private double salario;

    public Pessoa(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public static List<Pessoa> bancoDePessoas() {
        return asList(
                new Pessoa("André Martins", 32, 2000),
                new Pessoa("Mariana Alves", 23, 3521),
                new Pessoa("Mariana Alves", 22, 3521),
                new Pessoa("Jaque Cury", 33, 5500),
                new Pessoa("Muriel Tales", 27, 1493),
                new Pessoa("Mathias Alves", 25, 4233),
                new Pessoa("Kamila Tavares", 21, 4500),
                new Pessoa("Master Of POO", 19, 1800),
                new Pessoa("Natalia Silva", 34, 3500)
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
