package orientacaoAObjetos.Oexception.exception.dominio;

import orientacaoAObjetos.Oexception.exception.teste.LoginInvalidoException;

import java.io.FileNotFoundException;

public class Pessoa {
    public void salvar() throws LoginInvalidoException, FileNotFoundException{
        System.out.println("Salvando pessoa");
    }
}
