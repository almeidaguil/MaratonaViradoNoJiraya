package orientacaoAObjetos.AintroducaoAClasses.teste;

import orientacaoAObjetos.AintroducaoAClasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Robert";
        professor.idade = 45;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + " idade: " + professor.idade + " sexo" + professor.sexo);
    }
}
