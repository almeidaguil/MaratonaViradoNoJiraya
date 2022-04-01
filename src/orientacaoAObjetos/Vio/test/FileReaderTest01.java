package orientacaoAObjetos.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file)) {
            int i;//variavel auxiliar
            while ((i=fr.read()) != -1){
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*
fr.read() - vai retornar o numero do caracter na Tabela ASCII
------------
usando
 char[] in = new char[30]; //buffer de char
 fr.read(in);
 for (char c : in) {
 System.out.print(c);
 }
 retorna as 30 posições em texto legivel
 --------------------------------
 usando
int i;//variavel auxiliar
while ((i=fr.read()) != -1){//iterando sobre a variavel até ser diferente de -1
    System.out.print((char) i);
}
forcando um cast de char, enquanto i = fr.read() != -1 para imprimir todo o texto que está dentro do arquivo.

* */