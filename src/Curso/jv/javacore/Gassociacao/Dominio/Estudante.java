package Curso.jv.javacore.Gassociacao.Dominio;

public class Estudante {
    private String nome;
    private long matricula;
    private Disciplina[] disciplinas;

    public Estudante(String nome, long matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinas = new Disciplina[0];
    }

    public Estudante(String nome, long matricula, Disciplina[] disciplinas) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinas = disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina[] disciplinas) {
        if (disciplinas == null || disciplinas.length == 0) {
            System.out.println("Nao ha disciplinas cadastradas");
            return;
        }
        this.disciplinas = disciplinas;
    }

    public void matricularEmDisciplina(Disciplina disciplina) {
        // Adiciona a disciplina ao array de disciplinas do estudante
        int n = this.disciplinas.length;
        Disciplina[] novoArray = new Disciplina[n + 1];
        System.arraycopy(this.disciplinas, 0, novoArray, 0, n);
        novoArray[n] = disciplina;
        this.disciplinas = novoArray;
    }

    public void imprime() {
        if (disciplinas == null || disciplinas.length == 0) {
            System.out.println("Nao ha disciplinas");
            return;
        }
        System.out.println("Disciplinas do estudante " + this.nome + ":");
        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina.getNome());
        }
        System.out.println("---------------");
    }
}
