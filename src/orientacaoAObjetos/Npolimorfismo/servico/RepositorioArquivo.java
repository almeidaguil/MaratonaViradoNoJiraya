package orientacaoAObjetos.Npolimorfismo.servico;

import orientacaoAObjetos.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando um arquivo");
    }
}
