package br.com.abc.javacore.classesabstratas.classes;

//no diagrama de classes a classe e os metodos abstratos sao representados com os nomes em ITALICO
public abstract class Funcionario extends Pessoa{

    protected String clt;
    protected double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String clt, double salario) {
        this.nome = nome;
        this.clt = clt;
        this.salario = salario;
    }

    //quem extender funcionario é obrigado a sobrescrever o metodo calculaSalario
    public abstract void calculaSalario();

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", clt='" + clt + '\'' +
                ", salario=" + salario +
                '}';
    }

    public void imprime(){
        System.out.println("dentro da classe funcionario");
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClt() {
        return clt;
    }

    public void setClt(String clt) {
        this.clt = clt;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
