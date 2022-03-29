package orientacaoAObjetos.Oexception.teste;

public class StackOverFlow01 {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade() {
        recursividade();

    }
}
/*Erros são situações que você não tem como se recuperar em tempo de execução
 */