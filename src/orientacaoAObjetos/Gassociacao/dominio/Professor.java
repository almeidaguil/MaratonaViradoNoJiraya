package orientacaoAObjetos.Gassociacao.dominio;

public class Professor {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
//um professor pode trabalhar apenas em uma escola