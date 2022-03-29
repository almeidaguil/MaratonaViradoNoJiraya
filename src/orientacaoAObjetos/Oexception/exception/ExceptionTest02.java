package orientacaoAObjetos.Oexception.exception;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException{
        criarNovoArquivo();
    }

    public static void criarNovoArquivo() throws IOException {//forcando quem chamar o metodo a fazer a tratativa
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
/*PROS E CONTAS DE UTILIZAR TRY CATCH
  PROS:
 - está fazendo o tratamento de exceção, então o codigo não vai parar de funcionar
  CONTRAS:
 - a pessoa que está chamando seu método ele tecnicamente não tem opção de fazer o tratamento do jeito dele

 QUANDO UTILIZAR TRY CATCH E QUANDO UTILIZAR THROWS?
 - se você está querendo um método privado, possivelmente vai acabar utilizando o try catch, pois como o método é privado
 ninguém fora dessa classe vai poder chamar o metodo.
 - se o método for publico o ideal é utilizar o THROWS, pois não se sabe quem vai chamar o método e eles podem ter uma
 visão diferente de como a criação do arquivo deveria ser tratada.
 */