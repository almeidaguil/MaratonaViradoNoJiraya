package orientacaoAObjetos.Sformatacao.teste;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];
        df[0] = DateFormat.getInstance();//30/03/2022 13:33
        df[1] = DateFormat.getDateInstance();//30 de mar. de 2022
        df[2] = DateFormat.getDateTimeInstance();//30 de mar. de 2022 13:33:52
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);//30/03/2022
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);//30 de mar. de 2022
        df[5] = DateFormat.getDateInstance(DateFormat.LONG);//30 de março de 2022
        df[6] = DateFormat.getDateInstance(DateFormat.FULL);//quarta-feira, 30 de março de 2022

        for (DateFormat dateFormat : df) {
            System.out.println(dateFormat.format(calendar.getTime()));
        }
    }
}
//Formatação da datas
