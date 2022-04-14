package orientacaoAObjetos.Wnewio.teste;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        LocalDateTime date = LocalDateTime.now().minusDays(10);
        File file = new File("pasta 2/novo.txt");
        boolean isCreated = file.createNewFile();
        //modificando
        file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

        Path path = Paths.get("pasta 2/novo_path.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.from(Instant.ofEpochSecond(date.toInstant(ZoneOffset.UTC).toEpochMilli()));
        Files.setLastModifiedTime(path, fileTime);
        //outras formas
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isExecutable(path));

    }
}
//criada para da polimorfismo baseada no SO
//BasicFileAttributes = Mais geral
//DosFileAttributes = Basicamente uma implementação da BasicFileAttributes e praticamente todos os métodos são para leitura
//PosixFileAttributes = Mais voltada para sistemas de Unix'