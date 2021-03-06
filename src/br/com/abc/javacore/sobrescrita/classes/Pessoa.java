package br.com.abc.javacore.sobrescrita.classes;

public class Pessoa {

    private String nome;
    private int idade;
    //sobrecarga = mesmo nome de metodo com tipos ou quantidades de parametro diferentes

    //sobrescrita
    // -> mesmo nome, mesma qtde param

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
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
}
