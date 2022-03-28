package orientacaoAObjetos.Gassociacao.teste;

import orientacaoAObjetos.Gassociacao.dominio.AlunoExercicio;
import orientacaoAObjetos.Gassociacao.dominio.LocalExercicio;
import orientacaoAObjetos.Gassociacao.dominio.ProfessorExercicio;
import orientacaoAObjetos.Gassociacao.dominio.SeminarioExercicio;

public class TesteSeminario {
    public static void main(String[] args) {
        LocalExercicio local = new LocalExercicio("Rua ABC - 47");
        AlunoExercicio aluno = new AlunoExercicio("Adalberto", 19);
        ProfessorExercicio professor = new ProfessorExercicio("Rodrigo Maia", "Psicanalista");
        AlunoExercicio[] alunosParaSeminario = {aluno};

        SeminarioExercicio seminario = new SeminarioExercicio("O poder da mente", alunosParaSeminario, local);

        SeminarioExercicio[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}


/*Criar um sistama que gerencie seminários
O sistama deverá cadastrar seminários, estudantes, professores e local onde será realizado.
Um aluno poderá estar em apenas 1 seminários
Um seminários poderá ter nenhum ou varios alunos
Um professor poderá ministrar varios seminários
um seminário deve ter um local

campos basicos (excluindo relacionamento)
seminário: titulo
aluno: nome e idade
professor: nome e especialidade
local: endereço*/