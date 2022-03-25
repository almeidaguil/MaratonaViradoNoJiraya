package orientacaoAObjetos.CsobrecargaMetodos.teste;

import orientacaoAObjetos.CsobrecargaMetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("One Piace", "TV", 1013, "Ação");

        anime.imprime();
    }
}