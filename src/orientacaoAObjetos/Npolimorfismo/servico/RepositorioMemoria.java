package orientacaoAObjetos.Npolimorfismo.servico;

import orientacaoAObjetos.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
