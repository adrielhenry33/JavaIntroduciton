package Curso.jv.javacore.Gassociacao.Dominio;

public class Escola {
    private String nome;
    private Professor [] professores;

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessorres() {
        return professores;
    }

    public void setProfessorres(Professor[] professorres) {
        this.professores = professorres;
    }

    public void imprime(){
        System.out.println(this.nome);
        if (professores != null){
            for (Professor professor : professores){
                System.out.println(professor.getNome());
            }
        }
    }
}
