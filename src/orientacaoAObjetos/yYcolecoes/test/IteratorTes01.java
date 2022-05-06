package orientacaoAObjetos.yYcolecoes.test;

import orientacaoAObjetos.yYcolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTes01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(0L, "Hellsing ultimate", 19.99, 0));
        mangas.add(new Manga(2L, "Atack on titan", 29.99, 5));
        mangas.add(new Manga(4L, "Berserk", 27.99, 0));
        mangas.add(new Manga(1L, "Pokemon", 14.99, 2));
        mangas.add(new Manga(3L, "Dragon ball Z", 8.99, 0));

//        Iterator<Manga> mangaIterator = mangas.iterator();//checa antes de realizar uma ação
//        while (mangaIterator.hasNext()) {
//            if (mangaIterator.next().getQuantidade() == 0) {
//                mangaIterator.remove();
//            }
//        }
//        System.out.println(mangas);
        /*UTILIZANDO PROGRAMAÇÃO FUNCIONAL
        "manga" nessa parte é apenas uma variavel de referencia, poderia ter outro nome */
        mangas.removeIf(manga -> manga.getQuantidade()==0);
        System.out.println(mangas);

    }
}
/* Não é uma boa ideia fazer uma remoção utilizando for each!!!*/