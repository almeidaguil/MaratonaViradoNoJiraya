package orientacaoAObjetos.Oexception.runtime;

public class RuntimeExceptinTest03 {
    public static void main(String[] args) {
        abreConexao2();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {//sempre vai ser executado independente de qualquer coisa
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }
    private static void abreConexao2() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
        } finally {//sempre vai ser executado independente de qualquer coisa
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
/* Quando você precisa que uma parte do código seja executado independe da condição que está sendo executada dentro do
try catch
 */