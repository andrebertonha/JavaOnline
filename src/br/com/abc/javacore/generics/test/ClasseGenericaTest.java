package br.com.abc.javacore.generics.test;

import br.com.abc.javacore.generics.classes.Carro;
import br.com.abc.javacore.generics.classes.Computador;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>();
        carrosDisponiveis.add(new Carro("GOL"));
        carrosDisponiveis.add(new Carro("BMW"));
        ObjetosAlugaveis<Carro> carroAlugavel = new ObjetosAlugaveis<>(carrosDisponiveis);
        Carro carro = carroAlugavel.getObjetoDisponivel();
        System.out.println("usando o carro por 1 mes ");
        carroAlugavel.devolverObjeto(carro);
        System.out.println("----------------");

        List<Computador> computadoresDisponiveis = new ArrayList<>();
        computadoresDisponiveis.add(new Computador("ALIEN WARE"));
        computadoresDisponiveis.add(new Computador("LENOVO"));

        ObjetosAlugaveis<Computador> computadorAlugavel = new ObjetosAlugaveis<>(computadoresDisponiveis);
        Computador c = computadorAlugavel.getObjetoDisponivel();
        System.out.println("usando computador");
        computadorAlugavel.devolverObjeto(c);
    }
}
//Type
class ObjetosAlugaveis<T> {
    private List<T> objetosDisponiveis;

    public ObjetosAlugaveis(List<T> objetosDisponiveis){
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T getObjetoDisponivel(){
        T t = objetosDisponiveis.remove(0);
        System.out.println(" Alugando objeto: "+t);
        System.out.println("objetos disponiveis: "+ objetosDisponiveis);
        return t;
    }

    public void devolverObjeto(T t){
        System.out.println("devolvendo objeto: "+t);
        objetosDisponiveis.add(t);
        System.out.println("objetos disponiveis: "+ objetosDisponiveis);
    }
}
