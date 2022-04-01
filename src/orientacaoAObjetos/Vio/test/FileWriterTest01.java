package orientacaoAObjetos.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("Teste de escrita no arquivo usando fw.white\ncontinuando a escrita\n");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/* CLASSES FILE
FILE - CRIA O ARQUIVO
FILE WRITER - ESCREVE EM ARQUIVO (LOW LEVEL - NÃO TÃO UTILIZADA)
FILE READER - PARA LEITURA
BUFFERED WRITER - ESCREVER EM UM ARQUIVO COM UMA PERFORMANCE TRABALHANDO COM DADOS EM MEMORIA
BUFFERED READER - LER UM ARQUIVO COM UMA PERFORMANCE TRABALHANDO COM DADOS EM MEMORIA

quando se trabalha com leitura e escrita de arquivo, quase sempre estamos usando recursos do SO
e quase sempre quando estamos usando recursos do SO precisamos fechar

antes de fechar o arquivo devemos char o flush para que tudo que for mandando seja escrito e só depois fechado.

o texto sera sobrescrito se não usar o append
 */