package br.com.abc.javacore.exception.runtimeexception.test;

public class RuntimeExceptionTest {
    public static void main(String[] args) {

        try{
            divisao(0,0);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    private static void divisao(int num1, int num2){
        if(num2 == 0){
            throw new IllegalArgumentException("Passe valor diferente de 0 para num2");
        }
        System.out.println(num1/num2);
    }
}
