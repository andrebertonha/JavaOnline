package br.com.abc.javacore.blocodeinicializacao.classes;

public class Cliente {
    //1 eh alocado espaco na memoria para obj que sera criado
    //2 cada atributo de classe é criado e inicalizado com seus valores default ou valores explicitos
    //3 Bloco de Inicializacao eh executado
    //4 O construtor eh executado
    //bloco d inicializacao ANTES do constructor
    private int[] parcelas;
    {
        parcelas = new int[100];
        System.out.println("dentro do bloco inicializacao");
        for(int i=1; i<=100; i++){
            parcelas[i-1] = i;
        }
    }

    public Cliente(){
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
