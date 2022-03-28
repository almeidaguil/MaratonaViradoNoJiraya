package orientacaoAObjetos.JmodificadorFinal.teste;

import orientacaoAObjetos.JmodificadorFinal.dominio.Carro;
import orientacaoAObjetos.JmodificadorFinal.dominio.Comprador;
import orientacaoAObjetos.JmodificadorFinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setNome("Civic");

        System.out.println(Carro.VELOCIDADE_FINAL);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Fernando");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}
