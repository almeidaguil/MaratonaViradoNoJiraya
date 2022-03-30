package orientacaoAObjetos.Qstring.teste;

public class StringPerformaceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para string "+(fim-inicio) + "ms");
        inicio = System.currentTimeMillis();
        concatStringBilder(300000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBilder "+(fim-inicio) + "ms");
        inicio = System.currentTimeMillis();
        concatStringBuffer(300000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer "+(fim-inicio) + "ms");
    }

    private static void concatString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto +=i;
        }
    }
    private static void concatStringBilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
    private static void concatStringBuffer(int tamanho){
        StringBuffer sf = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sf.append(i);
        }
    }
}
