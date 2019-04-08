package br.com.abc.javacore.streams.classes;

import java.util.List;
import java.util.Objects;

import static java.util.Arrays.asList;

public class Pessoa {
    private String nome;
    private int idade;
    private double salario;
    private Genero genero;

    public Pessoa(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public Pessoa(String nome, int idade, double salario, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.genero = genero;
    }

    public static List<Pessoa> bancoDePessoas() {
        return asList(
                new Pessoa("André Martins", 32, 4500, Genero.MASCULINO),
                new Pessoa("Mariana Alves", 23, 3521, Genero.FEMININO),
                new Pessoa("Mariana Alves", 22, 3521, Genero.FEMININO),
                new Pessoa("Jaque Cury", 33, 5500, Genero.FEMININO),
                new Pessoa("Muriel Tales", 17, 1493, Genero.FEMININO),
                new Pessoa("Mathias Alves", 15, 4233, Genero.MASCULINO),
                new Pessoa("Kamila Tavares", 21, 4500, Genero.FEMININO),
                new Pessoa("Master Of POO", 19, 1800, Genero.MASCULINO),
                new Pessoa("Natalia Silva", 34, 3500, Genero.FEMININO)
        );
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                '}';
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

    public Genero getGenero() {
        return genero;
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
