package orientacaoAObjetos.Qstring.teste;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Guilherme"; //String constant pool
        String nome2 = "Guilherme";
        nome.concat("Almeida");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Guilherme");//1 variavel de referencia,2 objeto do tipo string, 3 uma string no poll de string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
