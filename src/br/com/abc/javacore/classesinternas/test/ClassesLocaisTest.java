package br.com.abc.javacore.classesinternas.test;

public class ClassesLocaisTest {
    private String nome;


    //classe interna ao metodo so pode ser chamada no metodo
    //
    public void fazAlgumaCoisa(){
        //so pode usar atributos do metodo que sejam final //se for java 8 no problem var ja eh final ou efetivamente final
        //so modificadores final ou abstract NUNCA ao mesmo tempo, abstract deve criar uma subclasse, final nao pode ser extendida
        class Interna {
            public void imprimeNomeExterno(){
                System.out.println(nome);
            }
        }
        Interna in = new Interna();
        in.imprimeNomeExterno();
    }

    public static void main(String[] args) {
        ClassesLocaisTest externa = new ClassesLocaisTest();
        externa.fazAlgumaCoisa();

    }
}
