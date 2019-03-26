package br.com.abc.javacore.colecoes.classes;

//colecoes performance big o
public class Celular {
    private String nome;
    private String IMEI;

    public Celular(String nome, String IMEI) {
        this.nome = nome;
        this.IMEI = IMEI;
    }

    //metodo equals:
    //Reflexivo = x.equals(x) tem que ser true para tudo que for diferente de null
    //Simetrico = para x e y diferentes de null , se x.equals(y) == true logo y.equals(x) tem que ser true
    //Transitividade para x y z diferentes de nulo se x.equals(y) == true logo y.equals(x) == true e x.equlas(z) == true logo y.equals(z) tb tem q ser true
    //Consistente x.equals(y) deve sempre retornar o mesmo valor

    //para x diferente de null x.equals(null) tem que retornar falso

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Celular outroCelular = (Celular) obj;
        return IMEI != null && IMEI.equals(outroCelular.getIMEI());
    }

    //se x.equals(y) for true, y.hashCode() == x.hashCode()
    //y.hashCode() == x.hashCode() nao necessariamente o equals devera retornar true
    //x.equals(y) ==false falso
    //y.hashCode() != x.hashCode() x.equals(y) devera ser false

    @Override
    public int hashCode() {
        return IMEI != null ? IMEI.hashCode() : 1;

    }

    @Override
    public String toString() {
        return "Celular{" +
                "nome='" + nome + '\'' +
                ", IMEI='" + IMEI + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }
}
