package introducao;

public class Aula05Condicionais {
    public static void main(String[] args) {
        int idade = 12;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcoolica");
        } else {
            System.out.println("NÃO AUTORIZADO!!");
        }

        System.out.println("--------------------\n\n");
        int idade1 = 12;
        String categoria;
        if (idade1 < 15) {
            categoria = "Categoria infantil";
        } else if (idade1 >= 15 && idade1 < 18) {
            categoria = "Categria juvenil";
        } else {
            categoria = "Categoria adulto";
        }
        System.out.println(categoria);


        //opedador ternario
        System.out.println("\n------------\n");
        double salario = 6000;
        String msgDoar = "Vou doar R$xx,xx!";
        String msgNaoDoar = "Não tenho dinheiro sufuciente para doar!";
        String resultado;

        resultado = salario > 9000 ? msgDoar : msgNaoDoar;
        System.out.println(resultado);

        //Switch
        System.out.println("\n____SWITCH____\n");

        byte dia = 5;
        switch (dia) { //switch só pode usar char, int, byte, short, enum, String
            case 1:
                System.out.println("Segunda - Feira");
                break;
            case 2:
                System.out.println("Terça - Feira");
                break;
            case 3:
                System.out.println("Quarta - Feira");
                break;
            case 4:
                System.out.println("Quinta - Feira");
                break;
            case 5:
                System.out.println("Sexta - Feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia invalido!! ");

        }
    }
}
