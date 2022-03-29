package orientacaoAObjetos.Npolimorfismo.teste;

import orientacaoAObjetos.Npolimorfismo.dominio.Computador;
import orientacaoAObjetos.Npolimorfismo.dominio.Produto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
    }
}
