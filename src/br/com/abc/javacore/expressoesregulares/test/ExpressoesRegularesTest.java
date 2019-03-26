package br.com.abc.javacore.expressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//REGEX
public class ExpressoesRegularesTest {
    public static void main(String[] args) {
        // metacaracteres:
        // \d - todos os digitos (numeros)// \D - todos os caracteres que nao sao digitos (numeros)
        // \s espacos em branco \t \n \r \f
        // \S caractere q nao eh em branco
        // \w caracteres de palavras a-z A-Z, digitos e _
        // \W tudo que nao for caractere de palavra
        // [] apenas o que for passado entre os colchetes ex: [abc] ou [a-c] [0-9] | hexadecimais 0xfff

        //quantificadores buscar por uma ou mais ocorrencia de determinado tipo
        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        // [n,m] de n até m
        // ( ) agrupar ([0-9a-fA-F])+ é igual a procurar [0-9a-fA-F] uma ou mais vezes
        // | ou
        // $ fim de linha
        // o(v|c)o = ovo ou oco
        // . eh coringa pode ser qualquer caracter
        // ^ [^abc] que nao seja abc

//        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
//        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";

//        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
//        String texto = "fulano@hotmail.com, 102Abc@gmail.com, #@!abrao@mail.com, teste@gmail.com.co.br, teste@mail";

//        String regex = "\\d{2}/\\d{2}/\\d{2,4}";
//        String texto = "05/10/2010 05/05/2015 1/1/01 01/05/95"; // dd/MM/yyyy

        String regex = "proj([^,])*";
        String texto = "proj1.bkp, proj1.java, proj1.class, projfinal.java, proj2.bkp, proj3.java, diagrama, texto, foto";

        System.out.println("Email valido? "+" #@!abrao@mail.com".matches(regex));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789  ");
        System.out.println("expressao:  " + matcher.pattern());
        System.out.println(" posicoes encontradas ");
        while (matcher.find()) {
            System.out.println(matcher.start() +" "+ matcher.group());
        }

    }
}
