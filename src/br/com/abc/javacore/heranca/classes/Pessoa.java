package br.com.abc.javacore.heranca.classes;

//todas classes extendem de Object
public class Pessoa {

    //protected pode acessar diretamente o atributo se estiver no mesmo pacote ou se estiver fora do pacote mas a classe tem que ser filha
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public Pessoa(String nome) {
        System.out.println("dentro do construtor de pessoa");
        this.nome = nome;
    }

    static {
        System.out.println("bloco de inicializacao estatico de pessoa");
    }

    {
        System.out.println("bloco de inicializacao de pessoa 1");
    }

    {
        System.out.println("bloco de inicializacao de pessoa 2");
    }

    public Pessoa(String nome, String cpf) {
        this(nome);
        this.cpf = cpf;
    }

    public void imprime() {
        System.out.println("Nome " + this.nome);
        System.out.println("Cpf " + this.cpf);
        System.out.println("Rua " + this.endereco.getRua());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
