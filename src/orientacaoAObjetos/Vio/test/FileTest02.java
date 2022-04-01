package orientacaoAObjetos.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        //Criando pasta/diretório
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCreated = fileDiretorio.mkdir();//vai criar um diretório
        System.out.println("Pasta criada? " + isDiretorioCreated);

        //criar arquivo dentro do diretório
//        File fileArquivoDiretorio = new File("C:\\Users\\guilh\\OneDrive\\Documentos\\Cursos\\Java\\MaratonaViradoNoJiraya\\pasta\\arquivo.txt");
        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt");//forma mais simples e pequena de criar um arquivo dentro do diretório
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println("arquivo.txt criado? " + isFileCreated);

        //renomear arquivo
        File fileRenamed = new File(fileDiretorio, "arquivo_renomeado.txt");//tem que passar o diretorio se nao cria na raiz do projeto
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println("Arquivo renomeado? " + isRenamed);

        //renomear diretorio
        File diretorioRenamed = new File("pasta 2");
        boolean isDiretorioRenomeado = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("Diretorio pasta renomeado? " + isDiretorioRenomeado);
    }
}
/*
ARQUIVOS PARA DIRETÓRIOS
como nos outros, cria a pasta apenas uma vez, como retorna um boolean, se imprimir retorna true ou false
 */