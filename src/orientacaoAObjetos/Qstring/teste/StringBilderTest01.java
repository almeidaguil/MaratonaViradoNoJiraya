package orientacaoAObjetos.Qstring.teste;

public class StringBilderTest01 {
    public static void main(String[] args) {
        String nome = "Guilherme Almeida";
        nome.concat("Silva");
        nome.substring(0,3);
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Guilherme Almeida");
        sb.append(" Silva").append(" Teste");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
