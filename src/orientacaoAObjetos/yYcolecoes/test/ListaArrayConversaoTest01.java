package orientacaoAObjetos.yYcolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Integer[] listToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));
        System.out.println("_____________");

        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1 ;
        numerosArray[1] = 2 ;
        numerosArray[2] = 3 ;

        //opção 1 - não pode fazer alteração atravez do asList
        List<Integer> arrayToList = Arrays.asList(numerosArray);
        arrayToList.set(0,12);
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);
        System.out.println("____________");

        //opção 2 - permite altração
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));
        numerosList.add(15);
        System.out.println(numerosList);

        //Criando o arrayList numa mesma linha
        List<String> strings = Arrays.asList("1", "2");//criando um array de string
        System.out.println(strings);

    }
}
/*Conversão de lista para array e vice versa
*/