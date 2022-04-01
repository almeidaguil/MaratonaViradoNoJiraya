package orientacaoAObjetos.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Teste de escrita no arquivo usando fw.white");
            bw.newLine();//pula linha baseado no SO ao inves de usar \n
            bw.write("continuando a escrita");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//é indicado para arquivos maiores
//tem uma escrita mais rápida, pois escreve em memória.