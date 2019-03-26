package br.com.abc.javacore.modificadorfinal.classes;

public class Carro {

    //variavel final existe antes mesmo da criacao do construtor
    public static final double VELOCIDADE_FINAL = 250; //constante = nao se pode alterar o valor
    public final Comprador COMPRADOR = new Comprador(); //nao pode referenciar a um novo obj just for example, nao deve
    //mos utilizar comprador dentro da classe carro.
    private String nome;
    private String marca;

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    //nao pode ser sobrescrito (quando a classe nao eh final)
    public final void imprime(){
        System.out.println("imprimindo carro");
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
