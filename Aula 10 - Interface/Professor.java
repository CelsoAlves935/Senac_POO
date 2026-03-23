public class Professor extends Pessoa implements ProfessorFinanceiro {

    private int salario;

    public Professor(String nome, int iD, int salario) {
        super(nome, iD);
        this.salario = salario;
    }

    @Override
    public void recebeSalario(){
        System.out.println( getNome() + " recebe salario de R$" + this.salario + ",00" );
    }
    
}
