package orientacaoAObjetos.TresourceBundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        boolean sasa = bundle.containsKey("sasa");//verificar se a chave existe dentro do arquivo properties
        System.out.println(sasa);
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        //Locale("fr","CA");
        //primeiro o java vai procurar se tem o arquivo messages_fr_CA.properties
        //se não encontrar vai procurar se tem o arquivo messages_fr.properties
        //se não encontrar vai procurar se tem o arquivo messages_pt_BR.properties
        //se não encontrar vai procurar se tem o arquivo messages_pt.properties
        //caso não encontre nenhum dos anteriores ele vai procurar por um arquivo base messages.properties
        //se não encontrar vai lançar uma exception
    }
}
