package introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //byte, short, int, long, float e double inicia em 0;
        //char '\u0000'
        //boolean false
        //String null
        String[] nomes = new String[3];//alterar o array manualmente(No momento, sdds spring boot kkk)
        nomes[0] = "Eu";
        nomes[1] = "Tu";
        nomes[2] = "Nós";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
