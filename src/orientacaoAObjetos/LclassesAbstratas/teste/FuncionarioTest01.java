package orientacaoAObjetos.LclassesAbstratas.teste;

import orientacaoAObjetos.LclassesAbstratas.dominio.Desenvolvedor;
import orientacaoAObjetos.LclassesAbstratas.dominio.Funcionario;
import orientacaoAObjetos.LclassesAbstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        //Funcionario funcionario = new Funcionario("Denise", 2540);
        Gerente gerente = new Gerente("Rafael", 4534);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Isadora", 7328);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
