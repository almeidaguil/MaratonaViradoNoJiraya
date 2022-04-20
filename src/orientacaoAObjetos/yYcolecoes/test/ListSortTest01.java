package orientacaoAObjetos.yYcolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Hellsing ultimate");
        mangas.add("Berserk");
        mangas.add("Pokemon");
        mangas.add("Atack on titan");
        mangas.add("Dragon ball Z");

        List<Double> valores = new ArrayList<>();
        valores.add(100.21);
        valores.add(23.98);
        valores.add(21.21);
        valores.add(98.10);

//          fazendo ordenação
        Collections.sort(mangas);
        Collections.sort(valores);

        for (String manga : mangas){
            System.out.println(manga);
        }

        for (Double valor : valores){
            System.out.println(valor);
        }
    }
}
