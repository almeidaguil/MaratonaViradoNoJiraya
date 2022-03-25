package orientacaoAObjetos.Dconstrutores.teste;


import orientacaoAObjetos.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("the seven deadly sins", "TV", 214, "Ação");
        anime.imprime();
    }
}