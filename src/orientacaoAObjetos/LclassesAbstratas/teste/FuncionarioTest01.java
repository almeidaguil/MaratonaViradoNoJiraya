package orientacaoAObjetos.LclassesAbstratas.teste;

import orientacaoAObjetos.LclassesAbstratas.dominio.Desenvolvedor;
import orientacaoAObjetos.LclassesAbstratas.dominio.Funcionario;
import orientacaoAObjetos.LclassesAbstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        //Funcionario funcionario = new Funcionario("Denise", 2540);
        Gerente gerente = new Gerente("Rafael", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Isadora", 1200);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
