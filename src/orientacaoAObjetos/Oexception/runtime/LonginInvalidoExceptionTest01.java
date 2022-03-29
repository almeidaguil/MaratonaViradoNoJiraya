package orientacaoAObjetos.Oexception.runtime;

import orientacaoAObjetos.Oexception.exception.LoginInvalidoException;

import java.util.Scanner;

public class LonginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
    private static void logar() throws LoginInvalidoException {
        Scanner entrada = new Scanner(System.in);
        String usernameBD = "ABC";
        String senhaDB = "1234";
        System.out.println("Usuário: ");
        String usernameDigitado = entrada.nextLine();
        System.out.println("Senha: ");
        String senhaDigitada = entrada.nextLine();
        if (!usernameBD.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuário ou senha invalálido");
        }

        System.out.println("Usuário logado com sucesso!!");
    }
}
