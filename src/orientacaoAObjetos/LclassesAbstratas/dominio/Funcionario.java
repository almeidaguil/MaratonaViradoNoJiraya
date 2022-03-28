package orientacaoAObjetos.LclassesAbstratas.dominio;

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public abstract void calculaBonus();

    @Override
    public void imprime() {
        System.out.println("Imprimindo");
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }
}

//classes abstratas foram criadas para resolver o problema de designer(desenho de codigo)
//mas como uma relação de como ta sendo implementando o designer do seu codigo.
//Quando a classe é declarada como abstract ela vira um "template" e nao pode ser criando um objeto do tipo da classe.
//Classes abstratas tem que ser estendidas(extends).
//--"traduzindo, funciona como uma interface que usei no spring boot com micro serviços"--