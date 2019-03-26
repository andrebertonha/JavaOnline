package br.com.abc.javacore.strings.test;

public class StringTest {
    public static void main(String[] args) {
        //string eh imutavel
        String nome = "Andre";
        nome = nome.concat(" Bertonha");
        String nome2 = "william";
        String nome3 = new String("cataruba"); //1 var de referencia 2 um obj tipo string 3 string no pool de string

        String teste = "goku";
        String teste2 = "0123456789";
        System.out.println(teste.charAt(0));
        System.out.println(teste.charAt(3));
        System.out.println(teste.equalsIgnoreCase(teste2));
        System.out.println(teste.length());
        System.out.println(teste.replace('o','z'));
        System.out.println(teste.toUpperCase());
        System.out.println(teste2.toLowerCase());
        System.out.println(teste2.substring(0,5));//fim o indice comeca do 1
        System.out.println(teste2.trim());
    }
}
