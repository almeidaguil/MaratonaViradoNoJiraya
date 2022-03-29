package orientacaoAObjetos.Npolimorfismo.teste;

import orientacaoAObjetos.Npolimorfismo.repositorio.Repositorio;
import orientacaoAObjetos.Npolimorfismo.servico.RepositorioArquivo;
import orientacaoAObjetos.Npolimorfismo.servico.RepositorioBancoDeDados;
import orientacaoAObjetos.Npolimorfismo.servico.RepositorioMemoria;

public class RepositorioTest {
    public static void main(String[] args) {
//        RepositorioBancoDeDados repositorioBancoDeDados = new RepositorioBancoDeDados();
//        RepositorioArquivo repositorioArquivo = new RepositorioArquivo();
//        RepositorioMemoria repositorioMemoria = new RepositorioMemoria();

// UTILIZANDO O TIPO MAIS GENERICO V
        Repositorio repositorioBD = new RepositorioBancoDeDados();
        Repositorio repositorioArquivo = new RepositorioArquivo();
        Repositorio repositorioMemoria = new RepositorioMemoria();

        repositorioBD.salvar();
        repositorioArquivo.salvar();
        repositorioMemoria.salvar();
    }
}
