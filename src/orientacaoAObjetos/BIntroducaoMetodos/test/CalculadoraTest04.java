package orientacaoAObjetos.BIntroducaoMetodos.test;

import orientacaoAObjetos.BIntroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("\nDentro da calculadoraTest04");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println(num1);
        System.out.println(num2);
    }
    //Dentro da classe quando se ta passando variaveis do tipo primitivo a variavel original nunca vai ser alterada! Pois está passando uma copia.
}
