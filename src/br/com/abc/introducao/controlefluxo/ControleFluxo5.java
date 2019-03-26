package br.com.abc.introducao.controlefluxo;

public class ControleFluxo5 {
    public static void main(String[] args) {
        //valor de carro, descubra quantas vezes pode ser parcelado, parcelas deve ser >1000

        double valorTotal = 30000;

        for(int parcela=1; parcela<=valorTotal; parcela++){
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }else {
                System.out.println("Parcela "+parcela +" R$" +valorParcela);
            }

        }
    }
}
