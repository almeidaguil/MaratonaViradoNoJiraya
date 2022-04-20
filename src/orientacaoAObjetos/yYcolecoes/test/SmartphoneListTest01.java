package orientacaoAObjetos.yYcolecoes.test;

import orientacaoAObjetos.yYcolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("2SDF2", "Pixel");
        Smartphone s3 = new Smartphone("3RTY3", "Samsung");
        List<Smartphone> smartphones = new ArrayList<>();

        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        for (Smartphone smartphone : smartphones ){
            System.out.println(smartphone);
        }
//        verificar se já existe o conteudo na lista
        Smartphone s4 = new Smartphone("3RTY3O", "Samsung");
        System.out.println(smartphones.contains(s4));//só retorna true ou false pra saber se existe
//        retornar o index(posição)
        int indexSmartphone = smartphones.indexOf(s4);
        if (indexSmartphone != -1){
            System.out.println(indexSmartphone);
        }
        System.out.println("Smartphone não encontrado");
    }
}
