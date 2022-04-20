package orientacaoAObjetos.yYcolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        nomes.add("nome1");
        nomes.add("nome2");

        for (String nome: nomes){//ForEach geralmente utilizado
            System.out.println(nome);
        }
        nomes.add("nome3");
        System.out.println("-------------");
        for (int i = 0; i< nomes.size(); i++){//for indexado
            System.out.println(nomes.get(i));
        }
    }
}
//Definir o tipo sempre na variável de referencia.