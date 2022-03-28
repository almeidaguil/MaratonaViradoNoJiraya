package orientacaoAObjetos.Hheranca.teste;

import orientacaoAObjetos.Hheranca.dominio.Endereco;
import orientacaoAObjetos.Hheranca.dominio.Funcionario;
import orientacaoAObjetos.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua das amoras - 37");
        endereco.setCep("21071-000");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Yago Matos");
        pessoa.setCpf("123.456.789-00");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("-----Funcionario-----");
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Alfredo Torres");
        funcionario.setCpf("098.765.432-11");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2333.87);

        funcionario.imprime();
    }
}
