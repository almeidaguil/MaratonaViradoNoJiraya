package orientacaoAObjetos.Kenum.teste;

import orientacaoAObjetos.Kenum.dominio.Cliente;
import orientacaoAObjetos.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Orlando", TipoCliente.PESSOA_FISICA);
        Cliente cliente1 = new Cliente("Cleia", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Marinalva", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente3 = new Cliente("Cezio", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
    }
}
