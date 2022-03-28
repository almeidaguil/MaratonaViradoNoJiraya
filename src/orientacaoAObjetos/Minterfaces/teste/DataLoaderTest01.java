package orientacaoAObjetos.Minterfaces.teste;

import orientacaoAObjetos.Minterfaces.dominio.DataBaseLoader;
import orientacaoAObjetos.Minterfaces.dominio.DataLoader;
import orientacaoAObjetos.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remover();
        fileLoader.remover();
        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();
    }
}
