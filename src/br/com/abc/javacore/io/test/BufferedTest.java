package br.com.abc.javacore.io.test;

import java.io.*;

public class BufferedTest {
    public static void main(String[] args) {
        //buffered reader had the better performance
        File file = new File("Arquivo.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));
             BufferedReader br = new BufferedReader(new FileReader(file))) {

            bw.write("Escrevendo uma msg no arquivo ");
            bw.newLine();
            bw.write("e pulando uma linha");
            bw.flush();
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


//        try {
//            FileWriter fw = new FileWriter(file);
//            BufferedWriter bw = new BufferedWriter(fw);
//
//            bw.write("Escrevendo uma msg no arquivo ");
//            bw.newLine();
//            bw.write("e pulando uma linha");
//            bw.flush();
//            bw.close();
//
//            FileReader fr = new FileReader(file);
//            BufferedReader br = new BufferedReader(fr);
//            String s = null;
//            while ((s = br.readLine()) != null) {
//                System.out.println(s);
//            }
//
//            br.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}
