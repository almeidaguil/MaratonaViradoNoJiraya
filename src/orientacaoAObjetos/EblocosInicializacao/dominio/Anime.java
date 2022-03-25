package orientacaoAObjetos.EblocosInicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] =i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio: this.episodios){
            System.out.print(episodio + " ");
        }
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public String getNome() {
        return nome;
    }
}
//Bloco de inicialização, geralmente, coloca-se no começo do codigo antes do construtores e depois dos atributos