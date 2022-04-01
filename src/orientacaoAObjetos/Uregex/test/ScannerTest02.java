package orientacaoAObjetos.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Levi,Eren,Mikasa,true,200";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");
        //ponteiros
        while (scanner.hasNext()) {
//             System.out.println(scanner.next()); //retorna com no exemplo de ScannerTest01
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("Int " + i);
            } else if (scanner.hasNextBoolean()) {
                boolean b = scanner.nextBoolean();
                System.out.println("Boolean " + b);
            } else {
                System.out.println(scanner.next());
            }
        }

    }
}
/* Scanner tem um delimitador padrão que é espaço em branco.
para usar outro delimitador é preciso usar o varival.useDelimiter("valor do delimitador");
usa dois ponteiros, um para verificar e um para andar

*/