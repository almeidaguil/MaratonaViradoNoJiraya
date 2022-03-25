package orientacaoAObjetos.BIntroducaoMetodos.test;

import orientacaoAObjetos.BIntroducaoMetodos.dominio.Estudante;
import orientacaoAObjetos.BIntroducaoMetodos.dominio.ImprimeEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante2 = new Estudante();
        Estudante estudante1 = new Estudante();
        ImprimeEstudante imprimeEstudante = new ImprimeEstudante();

        estudante1.nome = "Alberto";
        estudante1.idade = 18;
        estudante1.sexo = 'M';

        estudante2.nome = "Rafaela";
        estudante2.idade = 19;
        estudante2.sexo = 'F';

        imprimeEstudante.imprime(estudante1);
        imprimeEstudante.imprime(estudante2);

//        System.out.println(estudante1.nome);
//        System.out.println(estudante1.idade);
//        System.out.println(estudante1.sexo);
//
//        System.out.println("\n-----------");
//
//        System.out.println(estudante2.nome);
//        System.out.println(estudante2.idade);
//        System.out.println(estudante2.sexo);
    }
}