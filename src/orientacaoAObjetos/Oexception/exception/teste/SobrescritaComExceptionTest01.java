package orientacaoAObjetos.Oexception.exception.teste;

import orientacaoAObjetos.Oexception.exception.dominio.Funcionario;
import orientacaoAObjetos.Oexception.exception.dominio.Pessoa;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
}
//Para sobrescrita posso declarar todas as exceções, apenas uma ou nenhuma delas