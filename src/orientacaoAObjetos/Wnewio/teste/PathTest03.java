package orientacaoAObjetos.Wnewio.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest03 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/guilherme");//caminho relativo
        Path arquivo = Paths.get("dev/arquivo.txt");//caminho relativo
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

        Path absoluto = Paths.get("/home/guilherme/");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt");
        System.out.println("1 "+ absoluto.resolve(relativo));
        System.out.println("2 "+ absoluto.resolve(file));
        System.out.println("3 "+ relativo.resolve(absoluto));
        System.out.println("4 "+ relativo.resolve(file));
        System.out.println("5 "+ file.resolve(absoluto));
        System.out.println("6 "+ file.resolve(relativo ));
    }
}
/*
resolve - vai juntar os paths, mas...

- quando tenta fazer uma resolução com um caminho que já é absoluto (Paths.get("/home/guilherme/")), ele simplesmente
retorna o absluto, pois não tem nada para resolver
- no segundo caso (absoluto.resolve(file)) ele funcionou, adicionou o file.txt para o caminho relativo
-não pode adicionar de um caminho relativo para um absoluto
 */