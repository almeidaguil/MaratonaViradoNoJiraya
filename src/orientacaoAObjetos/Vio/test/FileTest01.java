package orientacaoAObjetos.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");//Cria no lugar que está sendo executado
//        File file = new File("C:\\Users\\guilh\\OneDrive\\Documentos\\Cursos\\Java\\MaratonaViradoNoJiraya\\arquivofile.txt");//em outro lugar tem que passar o caminho absoluto
        try {
            boolean isCreated = file.createNewFile();//se arquivo já for existente não criará outro "por cima"
            System.out.println("Created? " + isCreated);
            System.out.println("path "+file.getPath());
            System.out.println("is diretory "+file.isDirectory());
            System.out.println("is file  "+file.isFile());
            System.out.println("is hidden  "+file.isHidden());
            System.out.println("is modified "+ Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            boolean exists = file.exists();
            if (exists) {
                System.out.println("Deleted? " + file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*TIPOS DE PATH
PATH NAME = file.getPath() - retorna o nome do arquivo
PATH CAMINHO ABSOLUTO = file.getAbsolutePath() - retorna todo o caminho do local do arquivo
PATH DIRETORY = file.isDirectory() - retorna um booleano se é ou não diretorio
PATH ARQUIVO = file.isFile() - retorna um booleano se é ou não um arquivo
PATH ARQUIVO OCULTO = file.isHidden() - retorna um booleano se é ou não um arquivo oculto
PATH QUANDO FOI MODIFICADO = file.lastModified() - retorna a data de modificação em milisegundos
PATH QUANDO FOI MODIFICADO = nstant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault())) - retorna a data de modificação formatada
 */