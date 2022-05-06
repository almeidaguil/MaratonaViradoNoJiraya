package orientacaoAObjetos.yYcolecoes.test;

import orientacaoAObjetos.yYcolecoes.dominio.Consumidor;
import orientacaoAObjetos.yYcolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Rogerio Albuquerque");
        Consumidor consumidor2 = new Consumidor("Nathalia Teixeira");

        Manga manga1 = new Manga(0L, "Hellsing ultimate", 19.99);
        Manga manga2 = new Manga(2L, "Atack on titan", 29.99);
        Manga manga3 = new Manga(4L, "Berserk", 27.99);
        Manga manga4 = new Manga(1L, "Pokemon", 14.99);
        Manga manga5 = new Manga(3L, "Dragon ball Z", 8.99);

        List<Manga> mangaConsumidorList = List.of(manga1, manga2, manga4);
        List<Manga> mangaConsumidorList2 = List.of(manga3, manga5);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, mangaConsumidorList);
        consumidorMangaMap.put(consumidor2, mangaConsumidorList2);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
            System.out.println("---" + entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println("------" + manga.getNome());
            }

        }


    }
}
