package br.com.abc.javacore.associacao.test;

import br.com.abc.javacore.associacao.classes.Aluno;
import br.com.abc.javacore.associacao.classes.Local;
import br.com.abc.javacore.associacao.classes.Professor;
import br.com.abc.javacore.associacao.classes.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Andre Martins", 32);
        Aluno aluno2 = new Aluno("Joana Darc", 29);
        Seminario sem = new Seminario("Como ser um baita programador e ficar rico");
        Professor prof = new Professor("Yoda", "Usar a força para programar");
        Local local = new Local("Rua das arars","Mato");

        aluno.setSeminario(sem);
        aluno2.setSeminario(sem);

        sem.setProfessor(prof);
//        sem.setLocal(local);
//        sem.setAlunos(new Aluno[]{aluno,aluno2});

        Seminario[] semArray = new Seminario[1];
        semArray[0] = sem;
        prof.setSeminarios(semArray);

        sem.print();
        prof.print();
//        aluno.print();
//        local.print();

    }
}
