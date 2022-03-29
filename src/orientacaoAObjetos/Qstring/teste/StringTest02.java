package orientacaoAObjetos.Qstring.teste;

import java.util.Locale;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Théo";
        String numeros = "012345";
        System.out.println(nome.charAt(0));//retorna a posição que for passada
        System.out.println(nome.length());//retorna o tamanho da string
        System.out.println(nome.replace("T", "P"));//Troca o caracter por outro
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());

        System.out.println(numeros.substring(0,3));//sempre o valor -1
    }
}
