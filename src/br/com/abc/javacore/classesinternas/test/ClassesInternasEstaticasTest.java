package br.com.abc.javacore.classesinternas.test;

class Externa{
    static class Interna{
        public void imprimir(){
            System.out.println("oi");
        }
    }
}
//saber como chamar as classes estaticas para certificacaO**
public class ClassesInternasEstaticasTest {
    public static void main(String[] args) {
        Externa.Interna teste = new Externa.Interna();
        teste.imprimir();
        Interna2 test2 = new Interna2();
        test2.imprimir();
    }
    static class Interna2{
        public void imprimir(){
            System.out.println("teste dentro da class Interna2");
        }
    }
}
