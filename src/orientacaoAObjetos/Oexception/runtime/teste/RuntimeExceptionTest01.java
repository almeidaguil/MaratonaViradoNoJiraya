package orientacaoAObjetos.Oexception.runtime.teste;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {

    }
}
/*Exceções CHECKED e UNCHECKED
* CHECKED: São exceções filhas da classe EXCEPTION diretamente, e essas exceções se não tratadas elas vão lançar um erro
* em tempo de compilação.
* IOException - InputOutputException (entrada e saida)
*
* UNCHECKED: São exceções que são filhas e inclue a classe RuntimeException que quando lançadas pelo programa, quase 100%
* das vezes, o problema é o desenvolvedor (HAHAHA) que desenvolveu algo errado ou não fez uma tratativa que deveria ter
* feito.
*
* RumtimeException - uma exceção que acontece em tempo de execução
* */
/*     Gera um ArrayIndexOutOfBoundsException pois a posição 2 não existe.
        int[] nums = {1, 2};
        System.out.println(nums[2]); */

/*      Gera um NullPointerException pois o object é nulo.
        Object object = null;
        System.out.println(object.toString());*/