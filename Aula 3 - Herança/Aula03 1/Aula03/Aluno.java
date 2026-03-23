public class Aluno extends Pessoa {

    String curso;
    double nota;
    double mensalidade;

    public Aluno(String nome, int idade, String curso, double nota, double mensalidade) {
        this.curso = curso;
        this.nota = nota;
        this.mensalidade = mensalidade;

        setNome(nome);
        setIdade(idade);
        this.curso = curso;
        this.nota = nota;
        this.mensalidade = mensalidade;
    }


    public void Aprovacao(double nota) {
        if (this.nota >= 6) {
            System.out.println("Você está aprovado, Parabéns");
        } else {
            System.out.println("Infelizmente você reprovou! :<");
        }

    }

    public void pagaMensalidade() {
        System.out.println(getNome() + " tem a mensalidade paga!");

    }




    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    };

    

}
