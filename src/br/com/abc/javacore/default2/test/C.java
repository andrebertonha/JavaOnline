package br.com.abc.javacore.default2.test;

import br.com.abc.javacore.default2.interfaces.A;
import br.com.abc.javacore.default2.interfaces.B;
import br.com.abc.javacore.default2.interfaces.D;

public class C  implements A, B {
    public static void main(String[] args) {
        //metodo de mesma assinatura mais especifico sera selecionado
        new C().oi();
    }
    public void oi() {
        B.super.oi();
    }
}
