package br.com.abc.javacore.strings.test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30000  );
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto String "+(fim - inicio) +" ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(1000000  );
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuilder "+(fim - inicio) +" ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(1000000  );
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuffer "+(fim - inicio) +" ms");
    }

    private static void concatString(int tam) {
        String string = "";
        for(int i=0; i<tam; i++){
            string += i;
        }
    }

    //melhor performance StringBuilder
    private static void concatStringBuilder(int tam) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<tam; i++){
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tam) {
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<tam; i++){
            sb.append(i);
        }
    }
}
