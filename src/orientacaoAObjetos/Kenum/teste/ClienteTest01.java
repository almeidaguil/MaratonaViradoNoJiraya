package orientacaoAObjetos.Kenum.teste;

import orientacaoAObjetos.Kenum.dominio.Cliente;
import orientacaoAObjetos.Kenum.dominio.TipoCliente;
import orientacaoAObjetos.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Orlando", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente1 = new Cliente("Cleia", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente);
        System.out.println(cliente1);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

    }
}
