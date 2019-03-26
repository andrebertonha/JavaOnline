package br.com.abc.javacore.expressoesregulares.test;

public class TokenTest {
    public static void main(String[] args) {
        String str = "William, Paulo, Ana, John, Matheus, Camila";
        String[] token = str.split(",");
        for(String nome : token){
            System.out.println(nome.trim());
        }
    }
}
