package orientacaoAObjetos.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    public final int VALOR;//sempre vem dps das enumerações

    TipoCliente(int valor) {
        this.VALOR = valor;
    }

}
