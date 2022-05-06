package orientacaoAObjetos.yYcolecoes.test;

import orientacaoAObjetos.yYcolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(0L, "Hellsing ultimate", 19.99));
        mangas.add(new Manga(2L, "Atack on titan", 29.99));
        mangas.add(new Manga(4L, "Berserk", 27.99));
        mangas.add(new Manga(1L, "Pokemon", 14.99));
        mangas.add(new Manga(3L, "Dragon ball Z", 8.99));

        Collections.sort(mangas);
        //mangas.sort(new MangaByIdComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(3L, "Dragon ball Z", 8.99);

        System.out.println(Collections.binarySearch(mangas, mangaToSearch));

    }
}
/*Tem que passar, obrigatoriamente, uma lista ordenada.
- Retorna um valor positivo, somente se, o valor existir
* */