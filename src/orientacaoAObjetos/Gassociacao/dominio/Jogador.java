package orientacaoAObjetos.Gassociacao.dominio;

public class Jogador {
    private String nome;
    private Time time; //Um jogador pode fazer parte apenas de 1 time

    public void imprime() {
        System.out.println(this.nome);
        if (time != null){
            System.out.println(time.getNome());
        }
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
