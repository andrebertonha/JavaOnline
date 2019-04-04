package br.com.abc.javacore.default2.interfaces;

public interface MyList {
    static void sort(){
        System.out.println("dentro do sort");
    }
    void add();
    //adicionar codigo sem afetar o codigo dos desenvolvedores que ja estao prontos ou em desenvolvimeento

    default void remove(){
        System.out.println("dentro do remove");
    }
}
