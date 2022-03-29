package orientacaoAObjetos.Npolimorfismo.teste;

import orientacaoAObjetos.Npolimorfismo.dominio.Computador;
import orientacaoAObjetos.Npolimorfismo.dominio.Produto;
import orientacaoAObjetos.Npolimorfismo.dominio.Tomate;
import orientacaoAObjetos.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Italiano", 8.99);
        tomate.setDataDeValidade("14/12/2022");

        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(produto);

    }
}
