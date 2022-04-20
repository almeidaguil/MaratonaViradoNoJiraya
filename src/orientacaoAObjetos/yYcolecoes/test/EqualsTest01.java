package orientacaoAObjetos.yYcolecoes.test;

import orientacaoAObjetos.yYcolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("1ABC1", "iPhone");
        System.out.println(s1.equals(s2));
        //retornara false pois está fazendo referencia para objetos diferentes.
    }
}
//Equals para comparar conteúdo de strings
