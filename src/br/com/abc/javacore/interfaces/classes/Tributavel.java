package br.com.abc.javacore.interfaces.classes;

//numa interface todos metodos sao abstratos
//todos os metodos ja sao abstratos e publicos
//atributos sao sempre public static final
//metodos sempre public abstract independente de vc ver ou nao
public interface Tributavel {

    public static final double IMPOSTO = 0.2;
    //para certificacao se o metodo vir com chaves{} considerar como nao compila

    //private > default > protected > public
    //nunca pode sobrescrever em classes filhos um metodo mais restritivo que a classe pai
    void calcularImpostoMaisFrete();


}
