package orientacaoAObjetos.BIntroducaoMetodos.test;

import orientacaoAObjetos.BIntroducaoMetodos.dominio.FuncionarioExercicio;

public class FuncionarioTestExercicio {
    public static void main(String[] args) {
        FuncionarioExercicio funcionario = new FuncionarioExercicio();
        FuncionarioExercicio funcionario2 = new FuncionarioExercicio();
        FuncionarioExercicio funcionario3 = new FuncionarioExercicio();

        funcionario.nome = "Dagomí";
        funcionario.idade = 30;
        funcionario.salarios = new double[]{1200, 987.32, 2000};

        funcionario.imprimeDados();
    }
}