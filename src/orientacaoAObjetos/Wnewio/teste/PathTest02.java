package orientacaoAObjetos.Wnewio.teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta");//equivalente a new File("pasta")
        if (Files.notExists(pastaPath)) {
            Path pastaDirectory = Files.createDirectory(pastaPath);//caso o arquivo já exista ele lança uma exception
        }
        Path subPastaPath = Paths.get("pasta/subpasta/subsubpasta");
        Path pastaDirectories = Files.createDirectories(subPastaPath);

        //criando arquivo
        Path filePath = Paths.get(subPastaPath.toString(), "file.txt");
        if (Files.notExists(filePath)) {
            Path filePathCreated = Files.createFile(filePath);
        }

        //movendo e renomeando o arquivo
        Path source = filePath; //origem
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt"); //destino
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

    }
}
/*
Files.createDirectory(pastaPath) - cria apaneas uma pasta
Files.createDirectories(subPastaPath) - consegue fazer subpastas e é possivel criar apenas uma, sem lançar exception
 */
