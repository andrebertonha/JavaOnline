package br.com.abc.javacore.wrappers.test;

public class WrapperTest {
    public static void main(String[] args) {
        //DECORAR
        //tipos primitivos do java 8 -> do menor para o maior
        //numericos
        byte bytePrimitivo = 1;
        short shortPrimitivo = 1;
        int intPrimitivo = 10;
        long longPrimitivo = 10L;
        float floatPrimitivo = 10F;
        double doublePrimitivo = 10D;
        //nao numericos
        char charPrimitivo = 'A';
        boolean booleanPrimitivo = true;

        //classe wrapper que encapsula
        //WRAPPER herancas e polimorfismos
        //autoboxing primitivo dentro de uma caixa
        Byte byteWrapper = 1;
        Short shortWrapper = 1;
        Integer integerWrapper = new Integer("10");

        //filhos da classe number

        Long longWrapper = Long.valueOf("10");
        Float floatWrapper = 10F;
        Double doubleWrapper = 10D;

        Character charWrapper = 'A';
        Boolean bolleanWrapper = true;

        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetter('9'));
        System.out.println(Character.isLetterOrDigit('#'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));

    }
}
