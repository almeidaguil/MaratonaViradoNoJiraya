package orientacaoAObjetos.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Levi, Eren, Mikasa, true, 200";
        String[] nomes = texto.split(",");//delimitador não precisa ser exatamente uma vigula
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }

    }
}
/* Delimitadores pode ser "(espaço em branco)", "(\\d)"digito,
utilizando o splip pega os tokens de volta, que são os resultados da delimitação


*/