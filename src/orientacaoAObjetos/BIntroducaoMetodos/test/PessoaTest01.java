package orientacaoAObjetos.BIntroducaoMetodos.test;

import orientacaoAObjetos.BIntroducaoMetodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Alice");
        pessoa.setIdade(10);

        pessoa.imprime();

        System.out.println("\n---------------");
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
