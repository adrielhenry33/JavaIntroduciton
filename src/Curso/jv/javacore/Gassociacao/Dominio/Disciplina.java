package Curso.jv.javacore.Gassociacao.Dominio;

public class Disciplina {
    private String nome;
    private long codigo;
    private Estudante[] estudantes;

    public Disciplina(String nome, long codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.estudantes = new Estudante[0];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudante(Estudante[] estudantes) {
        this.estudantes = estudantes;
        for (Estudante estudante : estudantes) {
            estudante.matricularEmDisciplina(this);
        }
    }

    public void imprime() {
        if (estudantes == null || estudantes.length == 0) {
            System.out.println("Nao ha estudantes matriculados na disciplina " + this.nome);
            return;
        }
        System.out.println("Estudantes matriculados na disciplina " + this.nome + ":");
        for (Estudante estudante : estudantes) {
            System.out.println(estudante.getNome());
        }
        System.out.println("---------------");
    }
}
