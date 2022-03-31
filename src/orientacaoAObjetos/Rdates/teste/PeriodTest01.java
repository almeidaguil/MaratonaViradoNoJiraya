package orientacaoAObjetos.Rdates.teste;

import java.time.LocalDate;
import java.time.Period;

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
    }
}
//Baseado na data