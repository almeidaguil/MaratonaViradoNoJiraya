package orientacaoAObjetos.JmodificadorFinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_FINAL = 250;
    public final Comprador COMPRADOR = new Comprador();

    public final void imprime(){//faz com que o metodo não possa ser sobrescrito posteriormente!
        System.out.println(this.nome);
    }

    public Comprador getCOMPRADOR() {
        return COMPRADOR;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
/*uma constante é definida pela palavra final e tem que ser dado um valor*/