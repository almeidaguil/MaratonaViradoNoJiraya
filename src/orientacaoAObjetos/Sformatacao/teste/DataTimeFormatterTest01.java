package orientacaoAObjetos.Sformatacao.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);//20220331
        String s2 = date.format(DateTimeFormatter.ISO_DATE);//2022-03-31
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);//2022-03-31
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20220331", DateTimeFormatter.BASIC_ISO_DATE);//tem que passar um formato que bata com o padrão
        LocalDate parse2 = LocalDate.parse("2022-03-31", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2022-03-31", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);


        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("2022-03-31T12:54:28.88347");
        System.out.println(parse4);

        //formatando para um padrão personalizado
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);
        LocalDate parseBR = LocalDate.parse("31/03/2022", formatterBR);
        System.out.println(parseBR);

        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMANY);
        String formatGR = LocalDate.now().format(formatterGR);
        System.out.println(formatGR);
        LocalDate parseGR = LocalDate.parse("31.März.2022", formatterGR);
        System.out.println(parseGR);
    }
}
//sempre que tiver a palavra format está transformando o objeto em uma string
//sempre que tiver a palavra parse está transformando uma string em objeto