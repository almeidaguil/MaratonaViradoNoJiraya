package orientacaoAObjetos.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        System.out.println("Digite M ou F para seu sexo: ");
        char sexo = entrada.next().charAt(0);
        System.out.print("Meu nome " + nome + ", tenho " + idade + " anos e declarei meu sexo como " + sexo);
    }
}
//Leitura de dados do teclado é feita com a classe Scanner de Java.util