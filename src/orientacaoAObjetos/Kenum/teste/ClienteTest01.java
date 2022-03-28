package orientacaoAObjetos.Kenum.teste;

import orientacaoAObjetos.Kenum.dominio.Cliente;
import orientacaoAObjetos.Kenum.dominio.TipoCliente;

import static orientacaoAObjetos.Kenum.dominio.Cliente.*;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Orlando", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente1 = new Cliente("Cleia", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente);
        System.out.println(cliente1);

    }
}
