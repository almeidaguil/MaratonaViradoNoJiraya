package orientacaoAObjetos.Wnewio.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizacaTest01 {
    public static void main(String[] args) {
        String diretorioProjeto = "home/guilherme/dev";
        String arquivoTxt = "../../arquivo.txt";
        Path path1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(path1);
        System.out.println(path1.normalize());//normalizando
        Path path2 = Paths.get("/home/./guilherme/./dev/");
        System.out.println(path2);
        System.out.println(path2.normalize());
    }
}
