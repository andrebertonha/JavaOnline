package br.com.abc.javacore.modificadorestatico.classes;

public class Cliente {
    //0 bloco de inicializacao estatico é executado quando a JVM carregar a classe e é executado apenas 1 vez
    //1 eh alocado espaco na memoria para obj que sera criado
    //2 cada atributo de classe é criado e inicalizado com seus valores default ou valores explicitos
    //3 Bloco de Inicializacao eh executado
    //4 O construtor eh executado
    //bloco d inicializacao ANTES do constructor
    private static int[] parcelas;

    //bloco de inicializacao *estatico é inicializado apenas uma vez
    //parcela deve ser inicializada apenss UMA VEZ
    static {
        parcelas = new int[100];
        System.out.println("dentro do bloco inicializacao");
        for (int i = 1; i <= 100; i++) {
            parcelas[i - 1] = i;
        }
    }



    public Cliente() {
    }

    public static int[] getParcelas() {
        return parcelas;
    }


}
