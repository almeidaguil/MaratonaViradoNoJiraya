package orientacaoAObjetos.BIntroducaoMetodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }
    public void sutraiDoisNumeros(){
        System.out.println(5 - 3);
    }
    public  void multiplicaDoisNumeros(int num1, int num2){//com parametros
        System.out.println(num1 * num2);
    }
    public double divideDoisNumeros (double num1, double num2){
        if (num2 == 0){
            return 0;
        }
            return num1 / num2;

    }
    public void ImprimeDividsaoDoisNumeros (double num1, double num2){
        if (num2 == 0){
            System.out.println("Impossivel dividir por ZERO! ");
            return;
        }
        System.out.println(num1/num2);
    }
    public void  alteraDoisNumeros (int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
