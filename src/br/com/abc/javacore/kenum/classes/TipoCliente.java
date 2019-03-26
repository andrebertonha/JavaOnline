package br.com.abc.javacore.kenum.classes;

public enum TipoCliente {
    //constantes da enumeracao devem ser a primeira linha
    //constant specific class body
    PESSOA_FISICA(1, "Pessoa Fisica"),PESSOA_JURIDICA(2, "Pessoa Juridica"){
        public String getId(){
            return "B";
        }
    };

    private int tipo;
    private String nome;

    TipoCliente(int tipo, String nome) { //construtores em enumeracao ja sao privados
        this.tipo = tipo;
        this.nome = nome;
    }


    public String getId() {
        return "A";
    }

    public String getNome() {
        return nome;
    }

    public int getTipo() {
        return tipo;
    }
}
