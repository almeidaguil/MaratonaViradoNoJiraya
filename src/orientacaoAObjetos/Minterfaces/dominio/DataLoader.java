package orientacaoAObjetos.Minterfaces.dominio;

public interface DataLoader {
    void load();
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }
}
/*Interfaces são contratos que obriga a outra classe a implementar os metodos da interface*/