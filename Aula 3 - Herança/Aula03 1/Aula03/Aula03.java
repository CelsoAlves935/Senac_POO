public class Aula03 {
    public static void main(String[] args) {
        System.out.println("oi");

        Pessoa p1 = new Pessoa();
        // System.out.println(p1.getNome());

        Professor prof1 = new Professor("celso",50, 33, 47.000);
        prof1.fazAniversario();
        prof1.recebeSalario();
        System.out.println(prof1.getIdade());

        Aluno a1 = new Aluno("João", 23, "Arquitetura", 8.0, 1000);
        a1.fazAniversario();
        a1.Aprovacao(0);
        a1.pagaMensalidade();
        System.out.println(a1.getIdade());

        Aluno a2 = new Aluno("Pietra", 44, "TI", 5.5, 4000);
        a2.fazAniversario();
        a2.Aprovacao(0);
        a2.pagaMensalidade();
        System.out.println(a2.getIdade());
    }
}
