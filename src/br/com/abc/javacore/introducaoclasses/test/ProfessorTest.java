package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.cpf = "33322233322";
        professor.matricula = "12345";
        professor.nome = "Torres";
        professor.rg = "11122211-1";


        Professor prof = new Professor();
        prof.cpf = "1111111";
        prof.rg = "222222";
        prof.matricula = "1121";
        prof.nome = "Juciclei";

        professor = prof;

        System.out.println(professor.cpf);
        System.out.println(professor.matricula);
        System.out.println(professor.nome);
        System.out.println(professor.rg);
    }
}
