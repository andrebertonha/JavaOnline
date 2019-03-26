package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf = "123.345.323-23";
        prof.matricula = "45794-18";
        prof.nome = "Silas";
        prof.rg = "13.456.765-0";

        prof.imprime();
    }
}
