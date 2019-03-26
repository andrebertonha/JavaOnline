package br.com.abc.javacore.padroesdeprojeto.classes;

public interface Moeda {
    String getSimbolo();
}

class Real implements Moeda {
    @Override
    public String getSimbolo() {
        return "R$";
    }
}

class USDollar implements Moeda{

    @Override
    public String getSimbolo() {
        return "USD";
    }
}
