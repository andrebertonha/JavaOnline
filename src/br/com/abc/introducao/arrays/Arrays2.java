package br.com.abc.introducao.arrays;

public class Arrays2 {
    public static void main(String[] args) {
        //byte short int double float  sao iniciados com 0
        //char unicode vazio
        //boolean false
        //reference null
        String[] nomes = new String[3];

        nomes[0] = "Maria";
        nomes[1] = "Joao";
        nomes[2] = "Marta";


        for (int i = 0; i<nomes.length; i++){
            System.out.println(nomes[i]);
        }

    }
}
