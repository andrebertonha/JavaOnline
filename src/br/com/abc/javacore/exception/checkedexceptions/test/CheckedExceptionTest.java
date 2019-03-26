package br.com.abc.javacore.exception.checkedexceptions.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
    //throws deve tratar caso aconteca
    public static void main(String[] args) {

        abrirArquivo();

    }

    //se nao for excecao do tipo RuntimeException deve ser tradado como na linha abaixo e lancar como na ultima linha do metodo para poder possivelmente ser tratada denovo
    public static void criarArquivo() throws IOException {
        File f = new File("teste.txt");
        //tem que ter um metodo que lance o tipo de excecao passada no param do catch
        try {
            System.out.println("Arquivo criado? " + f.createNewFile());
            System.out.println("arquivo criado");
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static String abrirArquivo() {
        try {
            System.out.println("abrindo um arquivo");
            System.out.println("executando a leitura do arquivo");
            //throw new Exception();
            System.out.println("escrevendo no arquivo");
            return "valor";
        } catch (Exception e) {
            System.out.println("dentro do catch");
            e.printStackTrace();
        } finally { //FINALLY SEMPRE SERÁ EXECUTADO finally pode vir depois do catch ou do try
            System.out.println("fechar arquivo");
        }
        return null;
    }
}
