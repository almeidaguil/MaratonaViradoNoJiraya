package orientacaoAObjetos.Wnewio.teste;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributeTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta/teste.txt");
        if (Files.notExists(path)) Files.createFile(path);
        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
        System.out.println(dosFileAttributes.isHidden());//verificar se é oculto
        System.out.println(dosFileAttributes.isReadOnly());//verificar se é somente leitura

        DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
        fileAttributeView.setHidden(true);//oculto
        fileAttributeView.setReadOnly(true);//somente leitura
        System.out.println(fileAttributeView.readAttributes().isHidden());
        System.out.println(fileAttributeView.readAttributes().isReadOnly());


//        Files.setAttribute(path,"dos:hidden", true);//arquivo oculto
//        Files.setAttribute(path,"dos:readonly", true);//arquivo somente leitura
//        Files.setAttribute(path,"dos:hidden", false);
//        Files.setAttribute(path,"dos:readonly", false);
    }
}
