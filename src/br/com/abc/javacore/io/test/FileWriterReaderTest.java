package br.com.abc.javacore.io.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTest {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        //evitar fechar o arquivo manualmente, usar try with resources.
        try (FileWriter fw = new FileWriter(file);
             FileReader fr = new FileReader(file)) {
            fw.write("Escrevendo uma msg no arquivo \nE pulando uma linha 2");
            fw.flush();

            char[] in = new char[500];
            int size = fr.read(in);
            System.out.println("tamanho " + size);
            for (char c : in) {
                System.out.print(c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
//        try {
//            FileWriter fw = new FileWriter(file);
//            fw.write("Escrevendo uma msg no arquivo \nE pulando uma linha 2");
//            fw.flush();
//            fw.close();
//
//            FileReader fr = new FileReader(file);
//            char[] in = new char[500];
//            int size = fr.read(in);
//            System.out.println("tamanho "+size);
//            for(char c : in){
//                System.out.print(c);
//            }
//            fr.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
