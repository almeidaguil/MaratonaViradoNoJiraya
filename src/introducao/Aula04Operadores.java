package introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //Aritométicos ( +, -, /, *)
        double num1 = 10;
        double num2 = 20;
        double soma = num1 + num2;
        double sub = num1 - num2;
        double mult = num1 * num2;
        double div = num1 / num2;

        System.out.println("soma = " + soma);
        System.out.println("subtração = " + sub);
        System.out.println("multiplicação = " + mult);
        System.out.println("divisão = " + div);

        //Resto %

        int resto = 20 % 2; // saber se é impar ou par
        System.out.println(resto);

        //Logicos <, > ,<=, >=, ==, !=  retornam valores booleanos
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezMenorOuIgualVinte = 10 <= 20;
        boolean isDezMaiorOuIgualVinte = 10 >= 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;

        System.out.println("isDezMaiorQueVinte ? " + isDezMaiorQueVinte );
        System.out.println("isDezMenorQueVinte ? " + isDezMenorQueVinte );
        System.out.println("isDezMenorOuIgualVinte ? " + isDezMenorOuIgualVinte );
        System.out.println("isDezMaiorOuIgualVinte ? " + isDezMaiorOuIgualVinte );
        System.out.println("isDezIgualVinte ? " + isDezIgualVinte );
        System.out.println("isDezDiferenteVinte ? " + isDezDiferenteVinte );

        //Logicos 2 And(e) &&, Or (ou) ||, Not (não) ! retornam valores booleanos
        int idade = 35;
        float salario = 3500;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612; //todos tem que ser verdade
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalCC = 200;
        double valorTotalCP = 10000;
        float valorPS = 5000;
        boolean isPSCincoCompravel = valorTotalCC > valorPS || valorTotalCP > valorPS;
        System.out.println("isPSCincoCompravel " + isPSCincoCompravel);

        //Atribuição =, +=, *=, /=, %=
        double bonus = 1800;
        bonus += 1000;
        System.out.println("soma bonus " + bonus);
        bonus -= 1000;
        System.out.println("subtrai bonus " + bonus);
        bonus *= 2;
        System.out.println("multiplica bonus " + bonus);
        bonus /= 2;
        System.out.println("divide bonus " + bonus);
        bonus %= 2;
        System.out.println("resto bonus " + bonus);

        //unarios
        int contador = 1;
        contador ++;
        System.out.println("incremento depois um em um " + contador);
        contador --;
        System.out.println("deceremento depois um em um " + contador);

        ++contador;
        System.out.println("incremento antes " + contador);
        --contador;
        System.out.println("decremento antes " + contador);
    }
}
