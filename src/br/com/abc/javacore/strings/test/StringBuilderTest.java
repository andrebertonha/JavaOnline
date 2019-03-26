package br.com.abc.javacore.strings.test;

public class StringBuilderTest {
    public static void main(String[] args) {
        //StringBuilder e StringBuffer sao praticamente a mesma coisa, a diferenca eh que em StringBuffer os metodos sao sincronizados
        String s = "Uma frase comum";
        StringBuilder sb = new StringBuilder(16);
        sb.append("def").insert(3,"ghi").reverse().delete(2,4);
        System.out.println(sb);
    }
}
