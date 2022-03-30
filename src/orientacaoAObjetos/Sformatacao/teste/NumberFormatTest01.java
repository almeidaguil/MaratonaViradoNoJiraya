package orientacaoAObjetos.Sformatacao.teste;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localeBR = new Locale("pt","BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();//100.000.000,213
        nfa[2] = NumberFormat.getInstance(localeJP);//100.000.000,213
        nfa[1] = NumberFormat.getInstance(localeBR);//100,000,000.213
        nfa[3] = NumberFormat.getInstance(localeIT);//100.000.000,213
        double valor = 100_000_000.2130;
        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }

    }
}
