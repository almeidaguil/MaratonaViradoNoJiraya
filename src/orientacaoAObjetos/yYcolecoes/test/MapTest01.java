package orientacaoAObjetos.yYcolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();//necessita de chave* e valor**; LinkHashMap mantem a ordem de inserção
        map.put("teklado", "teclado");
        map.put("mauze", "mouse");
        map.put("vc", "você");
        map.putIfAbsent("vc", "você 2");//só adiciona se a chave não existir
        System.out.println(map);
        for (String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
        System.out.println("_______________");
        for (String valor : map.values()){
            System.out.println(valor);
        }
        System.out.println("______________");
        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - "+ entry.getValue());
        }
    }
}
/*NÃO PODE TER CHAVE DUPLICADA
* map.keySet(): retorna a chave
* map.values(): retorna o valor
* map.entrySet(): objeto que tem a chave e o valor*/