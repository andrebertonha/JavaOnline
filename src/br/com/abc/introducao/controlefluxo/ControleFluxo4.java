package br.com.abc.introducao.controlefluxo;

public class ControleFluxo4 {
    public static void main(String[] args){
        int contador = 0;

        while(contador < 10){
            System.out.println(++contador);

        }
        contador = 1;
        do{
            System.out.println("do do while");

            System.out.println(++contador);
        }while(contador < 10);

        for(int i=0; i<10; i++){
            if(i%2==0)
                System.out.println("pares "+i);
        }
    }


}
