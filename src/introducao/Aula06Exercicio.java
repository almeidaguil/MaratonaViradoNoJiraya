package introducao;

public class Aula06Exercicio {
    public static void main(String[] args) {
        //imprima todos os pares de 0 a 1000000
        int contador = 0;
        for (contador = 0; contador <= 1000000; contador++){
            if (contador % 2 == 0){
                System.out.println(contador);
            }

        }
    }
}
