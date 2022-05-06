package orientacaoAObjetos.yYcolecoes.test;

import orientacaoAObjetos.yYcolecoes.dominio.Consumidor;
import orientacaoAObjetos.yYcolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Rogerio Albuquerque");
        Consumidor consumidor2 = new Consumidor("Nathalia Teixeira");

        Manga manga1 = new Manga(0L, "Hellsing ultimate", 19.99);
        Manga manga2 = new Manga(2L, "Atack on titan", 29.99);
        Manga manga3 = new Manga(4L, "Berserk", 27.99);
        Manga manga4 = new Manga(1L, "Pokemon", 14.99);
        Manga manga5 = new Manga(3L, "Dragon ball Z", 8.99);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga4);
        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }

    }
}
