package orientacaoAObjetos.Npolimorfismo.teste;

import orientacaoAObjetos.Npolimorfismo.dominio.Computador;
import orientacaoAObjetos.Npolimorfismo.dominio.Televisao;
import orientacaoAObjetos.Npolimorfismo.dominio.Tomate;
import orientacaoAObjetos.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Notebook Avell A70 MOB GeForce RTX 3060 (6GB)", 9995.40);
        Tomate tomate = new Tomate("Tomate Cereja", 14.18);
        Televisao tv = new Televisao("Samsung 50\"", 5000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("--------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
