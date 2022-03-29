package orientacaoAObjetos.Oexception.exception.dominio;

import orientacaoAObjetos.Oexception.exception.teste.LoginInvalidoException;

public class Funcionario extends Pessoa{
    public void salvar() throws LoginInvalidoException {
        System.out.println("Salvando Funcionario");
    }
}
