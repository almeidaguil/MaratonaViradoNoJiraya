package orientacaoAObjetos.Rdates.teste;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);
        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(58);
        Period p4 = Period.ofMonths(12);
        Period p5 = Period.ofYears(2);

        System.out.println(p1);//P2Y7D(2anos e 7dias)
        System.out.println(p2);//P10D(10dias)
        System.out.println(p3);//P406D
        System.out.println(p4);//P12M
        System.out.println(p5);//P2Y
        System.out.println(p3.getMonths());
        System.out.println(Period.between(now, now.plusDays(p3.getDays())).getMonths());
        System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.MONTHS));//converte para meses
        System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.DAYS));//converte para dias

    }
}
//Baseado na data