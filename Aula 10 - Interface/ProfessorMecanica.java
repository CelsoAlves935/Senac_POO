public class ProfessorMecanica extends Professor implements Mecanica {
    public ProfessorMecanica(String nome, int iD, int salario) {
        super(nome, iD, salario);
    }

    @Override
    public void liberaAcessoOficina() {
        System.out.println("Professor " + getNome() + " entra na oficina.");
    }

    @Override
    public boolean temAcessoPesado() {
        return true;
    }

    @Override
    public int getIDPessoa() {
        return getID();
    }
}
