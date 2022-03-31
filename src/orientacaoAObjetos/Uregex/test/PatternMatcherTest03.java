package orientacaoAObjetos.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        String regex = "[a-zA-Z]";//vai buscar todas as letrar maiusculas e minusculas
//        String regex = "[abcABC]";
//        String texto = "abaaba";
        String texto2 = "cafeBABE";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto:  " + texto2);
        System.out.println("Índice: 0123456789");
        System.out.println("Regex:  " + regex);
        System.out.println("Posições encontradas");
        //funcionamento
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
        int numeroHex = 0x59F86A;
        System.out.println(numeroHex);
    }
}
/*EXPRESSÕES REGULARES ou REGEX
Meta caractere: como se fosse um "atalho" para conseguir pegar determinados caracteres
[] = o que fica dentro dos colchetes são "ranges"
[a-zA-Z]vai buscar todas as letrar maiusculas e minusculas

para escrever numeros em hexadecimal no java, deve começar com 0x ou 0X
 */