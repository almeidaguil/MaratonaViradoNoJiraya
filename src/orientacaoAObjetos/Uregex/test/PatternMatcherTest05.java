package orientacaoAObjetos.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";//buscar todos os padrões de e-mails validos
        String texto = "gados@hotmail.com, 123jamao@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.println("Email valido");
        System.out.println("#@!zoro@mail.br".matches(regex));
        System.out.println(Arrays.toString(texto.split(",")));//Delimitador / mostra todas as posições o array
        System.out.println((texto.split(","))[1].trim());//mostra a penas a posição do array sem espaços
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  " + texto);
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
[] = o que fica dentro dos colchetes são "ranges"
[a-zA-Z]vai buscar todas as letrar maiusculas e minusculas

QUANTIFICADORES: são caracteres dão poder em pegar determinada expressão na quantidade que o meta caracter representa
? = zero ou uma ocorrência
* = zero ou mais ocorrências
+ = uma ou mais ocorrências
{n,m} = intervalo de x a y
() = agrupamento
| = ou  ex.  o(v|c)o = vai dar match em ovo OU oco
$ fim da linha

para escrever numeros em hexadecimal no java, deve começar com 0x ou 0X
 */