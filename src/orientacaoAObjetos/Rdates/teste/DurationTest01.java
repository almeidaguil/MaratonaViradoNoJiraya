package orientacaoAObjetos.Rdates.teste;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinuns7Hours = LocalTime.now().minusHours(7);
        Duration d1 = Duration.between(now, nowAfterTwoYears);
        Duration d2 = Duration.between(timeNow, timeMinuns7Hours);
        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        Duration d4 = Duration.ofDays(20);
        Duration d5 = Duration.ofMinutes(3);



        System.out.println(d1);//PT17544H(17.544horas)
        System.out.println(d2);//PT-7H(7horas)
        System.out.println(d3);//PT16M40S(16minutos e 40segundos)
        System.out.println(d4);//PT480H(retorna que 20 dias equivalem a 480horas)
        System.out.println(d5);
    }
}
//Geralmente usada para saber a diferença de tempo entre duas datas
//P é o designador de duração (para período) colocado no início da representação de duração.
//  Y é o designador de ano que segue o valor do número de anos.
//  M é o designador de mês que segue o valor do número de meses.
//  W é o designador de semana que segue o valor do número de semanas.
//  D é o designador de dia que segue o valor do número de dias.
//T é o designador de tempo que precede os componentes de tempo da representação.
//  H é o designador de horas que segue o valor do número de horas.
//  M é o designador de minutos que segue o valor do número de minutos.
//  S é o segundo designador que segue o valor para o número de segundos.

//não aceita localdate