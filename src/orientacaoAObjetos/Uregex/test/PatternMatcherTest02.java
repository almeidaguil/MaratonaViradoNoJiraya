package orientacaoAObjetos.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        String regex = "\\W";
//        String texto = "abaaba";
        String texto2 = "hhj212gvh21 \t_!@#$%¨&¨*(){}";
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
    }
}
/*EXPRESSÕES REGULARES ou REGEX
Meta caractere: como se fosse um "atalho" para conseguir pegar determinados caracteres
\d = Retorna todos os digitos (usar "\\d")
\D = Tudo o que não for digito
\s = Todos os espaços em branco(\t \n \f \r)
\S = Todos os caracteres excluindo s espaços
\w = Tudo de a-z & A-Z, todos os valores numericos e _(não traz caracteres especiais(@#...)
\W = Tudo que não for incluso no \w inclusive os espaços em branco

____________________________
utilizando \d foi encontrado
(posição, numero)
    3       2
    4       1
    9       2
   10       1
____________________________
utilizando \D foi encontrado
(posição, ñ numeral)
    0         h
    1         h
    2         j
    6         g
    7         v
    8         h
____________________________
utilizando \s foi encontrado
(posição)
    11
    12
____________________________
utilizando \S foi encontrado
(posição, caractere)
    0         h
    1         h
    2         j
    3         2
    4         1
    5         2
    6         g
    7         v
    8         h
    9         2
   10         1

 */