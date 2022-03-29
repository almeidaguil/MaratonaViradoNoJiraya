package orientacaoAObjetos.Oexception.exception;

import orientacaoAObjetos.Oexception.exception.dominio.Leitor1;
import orientacaoAObjetos.Oexception.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {
            //está se encarregando de tomar conta de fechar a conexão dessa variavel de referencia
        } catch (IOException e) {

        }
    }

    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
//Try com recursos
/* - só pode colocar objetos (variaveis de referencia) dentro do TryWithResources que implementem a interface Closeable ou
AutoCloseable
- Até pode trabalhar sem o catch, porem tem que lançar a exceção na assinatura do método*/
