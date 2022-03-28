package orientacaoAObjetos.Gassociacao.dominio;

public class ProfessorExercicio {
    private String nomeProfessor;
    private String especialidade;
    private SeminarioExercicio[] seminarios;

    public ProfessorExercicio(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public ProfessorExercicio(String nomeProfessor, String especialidade) {
        this.nomeProfessor = nomeProfessor;
        this.especialidade = especialidade;
    }

    public ProfessorExercicio(String nomeProfessor, String especialidade, SeminarioExercicio[] seminarios) {
        this.nomeProfessor = nomeProfessor;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public void imprime() {
        System.out.println("-------------");
        System.out.println("Professor: " + this.nomeProfessor);
        if (this.seminarios == null) return;
        System.out.println("## Seminarios cadastrados ##");
        for (SeminarioExercicio seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
            System.out.println("** Alunos **");
            for (AlunoExercicio aluno : seminario.getAlunos()) {
                System.out.println("Aluno: " + aluno.getNomeAluno() + " idade: " + aluno.getIdade());
            }
        }

    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public SeminarioExercicio[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(SeminarioExercicio[] seminarios) {
        this.seminarios = seminarios;
    }
}
