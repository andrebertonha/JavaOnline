package br.com.abc.javacore.heranca.classes;

public class Endereco {

    // Ordem de execução / Certificação
    //1 - Espaço em memória é alocado para o objeto sendo construido;
    //2 = Cada um dos atriburos do objeto é criado e inicializado com os valores default;
    //3 - O construtor da superclasse é chamado/
    //4 - A inicialização dos atributos via declaração e o código do bloco de inicialização da superclasse
    // sao executados na ordem em que aparecem;
    //5 - o código do construtor da superclasse é chamado;
    //6 - Passo 4 para a subclasse é executado;
    //7 - o código do construtor da classe é chamado


    private String rua;
    private String bairro;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
