package orientacaoAObjetos.Gassociacao.dominio;

public class SeminarioExercicio {
    private String titulo;
    private AlunoExercicio[] alunos;
    private LocalExercicio local;

    public SeminarioExercicio(String titulo) {
        this.titulo = titulo;
    }

    public SeminarioExercicio(String titulo, AlunoExercicio[] alunos) {
        this.titulo = titulo;
        this.alunos = alunos;
    }

    public SeminarioExercicio(String titulo, AlunoExercicio[] alunos, LocalExercicio local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public AlunoExercicio[] getAlunos() {
        return alunos;
    }

    public void setAlunos(AlunoExercicio[] alunos) {
        this.alunos = alunos;
    }

    public LocalExercicio getLocal() {
        return local;
    }

    public void setLocal(LocalExercicio local) {
        this.local = local;
    }
}
