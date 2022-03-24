package introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //tipo de variaveis primitivos
        //int, double, float, char, byte, short, long, boolean

        int idade = 10;
        long idadeLong = 10;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';

        System.out.println(idade);
        //concatenação
        System.out.println("idade int: "+ idade);
        System.out.println("idade long: "+ idadeLong);
        System.out.println("salario double: "+ salarioDouble);
        System.out.println("salario float: "+ salarioFloat);
        System.out.println("idade Byte : " + idadeByte);
        System.out.println("idade Short : " + idadeShort);
        System.out.println("verdadeiro: " + verdadeiro);
        System.out.println("falso: " + falso);
        System.out.println("char: " + caractere);

        //String - reference type - não é um tipo primitivo!! não tem bem um limite de caracteres

        String nome = "Guilherme";
        System.out.println("String: " + nome);
    }
}
//tipos primitivos com exessão do boolean são numericos