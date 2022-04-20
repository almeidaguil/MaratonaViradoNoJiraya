package orientacaoAObjetos.yYcolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("nome1");
        nomes.add("nome2");
        nomes2.add("avbc");
        nomes.add("qwert");
//        nomes.remove("nome1");//vai executar um equals para as strings e remover se achar igual
//        nomes.remove(1); faz a remoção pelo índice

//        adicionar nomes2 na list nomes
        nomes.addAll(nomes2);

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