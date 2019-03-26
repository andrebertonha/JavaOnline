package br.com.abc.javacore.assertions.test;

public class AssertTest {
    public static void main(String[] args) {
        diasDaSemana(9);
    }

    //garantir que salario seja maior que 0, expressao tem que ser TRUE
    //nao utilizar em metodos publicos pessima pratica
    //boas praticas diz para usar o assert apenas em metodos privados
    private static void calculaSalario(double salario) {
        assert (salario > 0) : "O salario nao deve ser menor que 0";
        //calculo do salario
    }

    public static void diasDaSemana(int dia){
        switch (dia){
            case 1:break;
            case 2:break;
            case 3:break;
            case 4:break;
            case 5:break;
            case 6:break;
            case 7:break;
            default: assert false;
        }
    }
}
