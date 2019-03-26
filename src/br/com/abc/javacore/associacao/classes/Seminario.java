package br.com.abc.javacore.associacao.classes;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professor professor; //associacao = TEM UM
    private Local local;

    public Seminario() {

    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    //METODOS
    public void print(){
        System.out.println("--------------Relatorio de Seminario---------------");
        System.out.println("Titulo: "+this.titulo);


        if(this.professor != null)
            System.out.println("Professor Palestrante: "+this.professor.getNome());
        else
            System.out.println("Nenhum professor cadastrado para este seminario");

        if(this.local != null)
            System.out.println("Local: "+this.local.getRua()+ " Bairro "+this.local.getBairro());
        else
            System.out.println("Nenhum local cadastrado para este seminario");

        if(alunos!=null && alunos.length != 0){
            System.out.println("--------Alunos participantes:----------- ");
            for(Aluno aluno : alunos){
                System.out.println(aluno.getNome());
            }
            return;
        }
        System.out.println("Nenhum aluno cadastrado");

    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public void cadastrarSeminario(Seminario seminario) {
        System.out.println(this.titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
