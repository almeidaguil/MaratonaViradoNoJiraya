package orientacaoAObjetos.BIntroducaoMetodos.test;

import orientacaoAObjetos.BIntroducaoMetodos.dominio.Estudante;
import orientacaoAObjetos.BIntroducaoMetodos.dominio.ImprimeEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante2 = new Estudante();
        Estudante estudante1 = new Estudante();

        estudante1.nome = "Alberto";
        estudante1.idade = 18;
        estudante1.sexo = 'M';

        estudante2.nome = "Rafaela";
        estudante2.idade = 19;
        estudante2.sexo = 'F';

        estudante1.imprime();
        estudante2.imprime();

    }
}
