package br.com.abc.javacore.introducaoclasses.classes;

public class Estudante {

    private String nome;
    private int idade;
    private double[] notas;// = new double[3];
    private boolean aprovado;

    public void imprimirDadosAluno() {

        System.out.println(this.nome);
        System.out.println(this.idade);

        if (this.notas != null) {
            for (double nota : this.notas) {
                System.out.print(nota + " ");
            }
        }


    }

    public void tirarMedia() {

        if (this.notas == null) {
            System.out.println("Este aluno não possui notas");
            return;
        }
        double media = 0;
        for (double nota : this.notas) {
            media += nota;
        }
        media = media / this.notas.length;

        if (media > 6) {
            this.aprovado = true;
            System.out.println("\n Media: " + media + " APROVADO");
        }else
        {
            this.aprovado = false;
            System.out.println("\n Media: " + media + " REPROVADO");
        }

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if(idade < 0){
            System.out.printf("you cannot do this");
            return;
        }
        this.idade = idade;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double[] getNotas() {
        return this.notas;
    }

    //booleano usa is
    public boolean isAprovado(){
        return this.aprovado;
    }

}
