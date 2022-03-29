package orientacaoAObjetos.Npolimorfismo.servico;

import orientacaoAObjetos.Npolimorfismo.dominio.Produto;
import orientacaoAObjetos.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {//metodo generico utilizando polimorfismo
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: R$" + produto.getValor());
        System.out.println("Impostoa ser pago: R$" + imposto);
        if (produto instanceof Tomate) {//se produto for uma instancia de Tomete faça...
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataDeValidade());
        }
    }

//    public static void CalcularImpostoComputador(Computador computador) {
//        System.out.println("Relarótio de imposto do computador");
//        double imposto = computador.calcularImposto();
//        System.out.println("Computador: " + computador.getNome());
//        System.out.println("Valor R$" + computador.getValor());
//        System.out.println("Imposto a ser pago: R$" + imposto);
//    }
//
//    public static void CalcularImpostoTomate(Tomate tomate) {
//        System.out.println("Relarótio de imposto do Tomate");
//        double imposto = tomate.calcularImposto();
//        System.out.println("Tomate: " + tomate.getNome());
//        System.out.println("Valor R$" + tomate.getValor());
//        System.out.println("Imposto a ser pago: R$" + imposto);
//    }
}
//Criamos uma calsee abstrata "Produto" pois produto em si não deve existir, nao podemos instanciar um new Produto
//depois criamos duas classes que estendem produto "computador" e "tomate", consequentemente precisamos de um construtor
//depois criamos uma interface taxavel que tem um unico metodo que chama "calcularImposto();" e foi declarado implements em Produto
//depois foi implementado nas duas classes que estende produto
//depois foi criado uma classe de serviço que é onde fica a regra de negocio relacionada ao relatorio de calculo dos impostos
//para finalizar criamos o teste