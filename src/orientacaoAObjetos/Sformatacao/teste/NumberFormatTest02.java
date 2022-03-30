package orientacaoAObjetos.Sformatacao.teste;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localeBR = new Locale("pt","BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance();//R$ 100.000.000,21
        nfa[1] = NumberFormat.getCurrencyInstance(localeBR);//R$ 100.000.000,21
        nfa[2] = NumberFormat.getCurrencyInstance(localeJP);//￥100,000,000
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);//100.000.000,21 €
        double valor = 100_000_000.2130;
        for (NumberFormat numberFormat : nfa) {
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }

    }
}
