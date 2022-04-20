package orientacaoAObjetos.yYcolecoes.test;

import orientacaoAObjetos.yYcolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(0L,"Hellsing ultimate", 19.99));
        mangas.add(new Manga(2L, "Atack on titan", 29.99));
        mangas.add(new Manga(4L,"Berserk", 27.99));
        mangas.add(new Manga(1L,"Pokemon", 14.99));
        mangas.add(new Manga(3L,"Dragon ball Z", 8.99));

//        fazendo ordenação
        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}
