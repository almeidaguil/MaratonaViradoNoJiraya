package orientacaoAObjetos.BIntroducaoMetodos.dominio;

public class FuncionarioExercicio {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimeDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null){
            return;
        }
            for (double salario : salarios) {
                System.out.print("R$" + salario + " ");
            }
        imprimeMediaSalarial();
    }

    public void imprimeMediaSalarial() {
        if (salarios == null){
            return;
        }
        double media = 0;

            for (double salario : salarios) {
                media += salario;
            }
            media /= salarios.length;
            System.out.println("\nA média salaria é de R$" + media);
    }
}
