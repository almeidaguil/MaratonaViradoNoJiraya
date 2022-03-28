package orientacaoAObjetos.JmodificadorFinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_FINAL = 250;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
/*uma constante é definida pela palavra final e tem que ser dado um valor*/