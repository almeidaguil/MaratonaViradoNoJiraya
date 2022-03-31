package orientacaoAObjetos.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "aba";
//        String texto = "abaaba";
        String texto2 = "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto:  " + texto2);
        System.out.println("Índice: 0123456789");
        System.out.println("Regex:  " + regex);
        System.out.println("Posições encontradas");
        //funcionamento
        while (matcher.find()){
            System.out.print(matcher.start()+" ");
        }
    }
}
/*EXPRESSÕES REGULARES ou REGEX
Nada mais é do que uma linguaguem desenvolvida que utiliza meta caractere (símbolos)
ele vai encontrar padrões no texto
Também utilizado para validações (sintaticamente correto)
Pattern: padrão
Matcher: encontra o padrão

 no exemplo do codigo ele vai encontrar na posição 0 e 4, apesar de ter "aba" formando na posição 2 ele vai ignorar pois
 a posição 2 já foi utilizada.
 */