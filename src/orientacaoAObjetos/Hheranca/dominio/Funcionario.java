package orientacaoAObjetos.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome){
        super(nome);
    }

    @Override
    public void imprime() {
        super.imprime();//Usando o super.xxxx ele faz a sobrescrita do metodo chamado e é possivel fazer a adição
        System.out.println("R$" + this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + " recebi o salario de R$" + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
