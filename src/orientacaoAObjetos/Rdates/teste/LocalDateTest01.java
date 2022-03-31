package orientacaoAObjetos.Rdates.teste;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        //A partir do java 8 V
        LocalDate date = LocalDate.of(2022, Month.JANUARY,27);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear());//informa se o ano é bissexto
        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
        System.out.println(date);//mudaram a formatação da data para o padrão que é salvo no banco de dados (2022-01-27)

        LocalDate agora = LocalDate.now();//data do dia atual baseado no SO
        System.out.println(agora);

        System.out.println(LocalDate.MAX);//data maxima que pde ser utilizada(+999999999-12-31)
        System.out.println(LocalDate.MIN);//data minima que pde ser utilizada(-999999999-01-01)

    }
}
