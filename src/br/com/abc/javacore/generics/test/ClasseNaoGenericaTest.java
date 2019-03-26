package br.com.abc.javacore.generics.test;

import br.com.abc.javacore.generics.classes.Carro;
import br.com.abc.javacore.generics.classes.Computador;


import java.util.ArrayList;
import java.util.List;

public class ClasseNaoGenericaTest {
    public static void main(String[] args) {
        CarroAlugado carroAlugavel = new CarroAlugado();
        Carro carroAlugado = carroAlugavel.getCarroDisponivel();
        System.out.println("usando o carro por 1 mes ");
        carroAlugavel.devolverCarro(carroAlugado);

        System.out.println("----------------------");
        ComputadorAlugado computadorAlugavel = new ComputadorAlugado();
        Computador computador = computadorAlugavel.getComputadorDisponivel();
        System.out.println("usando pc ");
        computadorAlugavel.devolverComputador(computador);
    }
}

class CarroAlugado {
    private List<Carro> carrosDisponiveis = new ArrayList<>();
    {
        carrosDisponiveis.add(new Carro("Gol"));
        carrosDisponiveis.add(new Carro("BMW"));
    }

    public Carro getCarroDisponivel(){
        Carro c = carrosDisponiveis.remove(0);
        System.out.println(" Alugando carro: "+c);
        System.out.println("Carros disponiveis: "+carrosDisponiveis);
        return c;
    }

    public void devolverCarro(Carro c){
        System.out.println("devolvendo carro: "+c);
        carrosDisponiveis.add(c);
        System.out.println("Carros disponiveis: "+carrosDisponiveis);
    }
}

class ComputadorAlugado {
    private List<Computador> computadoresDisponiveis = new ArrayList<>();
    {
        computadoresDisponiveis.add(new Computador("AlienWare"));
        computadoresDisponiveis.add(new Computador("HP"));
    }

    public Computador getComputadorDisponivel(){
        Computador c = computadoresDisponiveis.remove(0);
        System.out.println(" Alugando pc: "+c);
        System.out.println("pc disponiveis: "+ computadoresDisponiveis);
        return c;
    }

    public void devolverComputador(Computador c){
        System.out.println("devolvendo pc: "+c);
        computadoresDisponiveis.add(c);
        System.out.println("pc disponiveis: "+ computadoresDisponiveis);
    }
}
