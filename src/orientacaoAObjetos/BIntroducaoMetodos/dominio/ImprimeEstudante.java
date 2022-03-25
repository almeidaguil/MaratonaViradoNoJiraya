package orientacaoAObjetos.BIntroducaoMetodos.dominio;

public class ImprimeEstudante {
    public void imprime(Estudante estudante){
        System.out.println("\n-----------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
