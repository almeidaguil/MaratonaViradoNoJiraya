package orientacaoAObjetos.BIntroducaoMetodos.test;

import orientacaoAObjetos.BIntroducaoMetodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Dagomí");
        funcionario.setIdade(30);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});

        funcionario.imprimeDados();
    }
}