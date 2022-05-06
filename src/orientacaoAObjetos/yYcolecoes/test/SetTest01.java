package orientacaoAObjetos.yYcolecoes.test;

import orientacaoAObjetos.yYcolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();//Utilizar LinkedHashSet<>() manter a ordem de inserção
        mangas.add(new Manga(0L,"Hellsing ultimate", 19.99));
        mangas.add(new Manga(2L, "Atack on titan", 29.99));
        mangas.add(new Manga(4L,"Berserk", 27.99));
        mangas.add(new Manga(1L,"Pokemon", 14.99));
        mangas.add(new Manga(3L,"Dragon ball Z", 8.99));
        mangas.add(new Manga(3L,"Dragon ball Z", 8.99));//terá apenas um mesmo assim

        for (Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
/*Set não permite elamentos duplicados dentro da coleção e não é indexado
* Hashset faz a organização, mas não tem como garantir como estarão ordenados  */