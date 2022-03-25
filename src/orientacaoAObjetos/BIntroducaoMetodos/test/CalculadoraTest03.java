package orientacaoAObjetos.BIntroducaoMetodos.test;

import orientacaoAObjetos.BIntroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20, 10);
        System.out.println(result);
        System.out.println("\n------\n");
        calculadora.ImprimeDividsaoDoisNumeros(10, 0);
    }
}
