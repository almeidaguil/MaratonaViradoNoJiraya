package orientacaoAObjetos.Oexception.runtime;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        divisao(1, 0);

        System.out.println("Código finalizado!");
    }

    /**
     *
     * @param a
     * @param b DIVIDENDO NÃO PODE SER ZERO
     * @return
     * @throws IllegalArgumentException CASO DIVIDENDO SEJA ZERO
     */

    private static int divisao(int a, int b) {
        if (b == 0) {
            //throw new RuntimeException("Argumento ilegal, dividendo não pode ser zero"); ou
            throw new IllegalArgumentException("Argumento ilegal, dividendo não pode ser zero");
        }
        return a / b;
    }
}
//Exceções do tipo unchecked não necessariamente precisam ser declaradas dentro do metodo. Pode colocar throws "EXCEÇÃO"
//na assinatura do metodo.
/*Para lançar novas exceções utiliza throw new EXCEÇÃO ("MSG_PARA_APARECER_NO_CONSOLE");
 * Caso queira avisar outras pessoas que estão utilizando seu metodo coloca na assinatura do metodo: throws EXCEÇÃO*/