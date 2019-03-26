package br.com.abc.javacore.heranca.classes;

//HERANÇA *É UM ex: functionario eh uma pessoa! uml: seta fechada do filho p/ o pai
//herda atributos e metodos
public class Funcionario extends Pessoa {

    private double salario;

    {
        System.out.println("Bloco de inicializacao de Funcionario 1");
    }

    {
        System.out.println("Bloco de inicializacao de Funcionario 2");
    }

    static {
        System.out.println("Bloco de inicializacao static de Funcionario ");
    }

    public Funcionario(String nome) {
        super(nome); //super nao utiliza ponto ( . ) e deve ser utilizado na primeira linha
        System.out.println("dentro do construtor de funcionario");
    }

    public void imprime() {
        super.imprime(); //chama metodo imprime da classe PAI = Pessoa
        System.out.println("salario: " + this.salario);
        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento() {
        System.out.println("Eu " + super.nome + " recebi o pagamento de  " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
