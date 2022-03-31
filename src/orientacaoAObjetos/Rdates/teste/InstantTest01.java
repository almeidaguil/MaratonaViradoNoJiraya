package orientacaoAObjetos.Rdates.teste;

import java.time.Instant;

public class InstantTest01 {
    public static void main(String[] args) {
        //trabalha com nano segundos
        Instant now = Instant.now();
        System.out.println(now); //retorna um zulu time que é um horario neutro

        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());
        System.out.println(Instant.ofEpochSecond(3,0));
        System.out.println(Instant.ofEpochSecond(3,1_000_000_000));
    }
}
