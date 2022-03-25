package orientacaoAObjetos.FmodificadorEstatico.dominio;

public class Carro {
    private String nome;
    private double velicidadeMaxima;
    public static double velicidadeLimite = 250;

    public Carro(String nome, double velicidadeMaxima) {
        this.nome = nome;
        this.velicidadeMaxima = velicidadeMaxima;
    }

    public void imprime() {
        System.out.println("---------------");
        System.out.println("Nome " + this.nome);
        System.out.println(" Velocidade Maxima " + this.velicidadeMaxima);
        System.out.println(" Velocidade Limite " + Carro.velicidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelicidadeMaxima() {
        return velicidadeMaxima;
    }

    public void setVelicidadeMaxima(double velicidadeMaxima) {
        this.velicidadeMaxima = velicidadeMaxima;
    }

}
