package introducao;

public class Aula06EstruturaDeRepeticao {
    public static void main(String[] args) {
        //while, do while, for
        System.out.println("----While----\n");//se falso nao executa
        int contador = 0;
        while (contador <10){
            System.out.println(++contador);
        }
        System.out.println("\n\n----Do While---");//executa ao menos 1x
        contador = 0;

        do{
            System.out.println("contador Do While" + contador);
            contador++;
        }while (contador < 10);

        System.out.println("\n---For---\n");
        for (contador = 0; contador < 10; contador ++){
            System.out.println("For " + contador);
        }
    }
}
