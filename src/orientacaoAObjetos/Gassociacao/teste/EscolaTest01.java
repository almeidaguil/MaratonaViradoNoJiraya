package orientacaoAObjetos.Gassociacao.teste;

import orientacaoAObjetos.Gassociacao.dominio.Escola;
import orientacaoAObjetos.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Adriano");
        Professor professor2 = new Professor("Maria");
        Professor[]professores = {professor1, professor2};
        Escola escola = new Escola("E.E.M Olivia Albane", professores);

        escola.imprime();
    }
}
