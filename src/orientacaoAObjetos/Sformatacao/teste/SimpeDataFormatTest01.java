package orientacaoAObjetos.Sformatacao.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpeDataFormatTest01 {
    public static void main(String[] args) {
        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";//2022.03.30 d.C. at 17:53:29 BRT
        String pattern1 = "'Amsterdam' dd 'de' MMMM 'de' yyyy";//Amsterdam 30 de março de 2022
        SimpleDateFormat sdf = new SimpleDateFormat(pattern1);
        System.out.println(sdf.format(new Date()));
        try {
            System.out.println(sdf.parse("Amsterdam 30 de março de 2022"));//tem que passar o mesmo formato declarado
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
