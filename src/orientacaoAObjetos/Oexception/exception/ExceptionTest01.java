package orientacaoAObjetos.Oexception.exception;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        }catch (IOException e){
            //NUNCA NUNCA NUNCA DEIXAR ESSE BLOCO EM BRANCO!!
            e.printStackTrace();
            //REGRA DE NEGOCIO NÃO DEVE SER COLOCADA NO CATCH
        }
    }
}
