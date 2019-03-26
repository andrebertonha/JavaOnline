package br.com.abc.javacore.introducaometodos.classes;

//atributos nome, matricula, rg, cpf
//classe de test para preencher e imprimir os dados
public class Professor {

    public String nome;
    public String matricula;
    public String rg;
    public String cpf;

    public void imprime(){

        //this pegar os valores dentro do proprio objeto
        System.out.println(this.cpf);
        System.out.println(this.matricula);
        System.out.println(this.nome);
        System.out.println(this.rg);

    }

}
