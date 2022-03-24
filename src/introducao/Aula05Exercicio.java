package introducao;

public class Aula05Exercicio {
    public static void main(String[] args) {
        //Dados os valores de 1 a 7, imprima se o dia é util ou fim de semana
        //Considerando 1 como domingo

        int dia = 3;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Fim de semana ");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil ");
                break;
            default:
                System.out.println("Dia invalido!!");
                break;

        }
    }
}
