public class AlunoMecanica extends Aluno implements Mecanica {
    public AlunoMecanica(String nome, int iD) {
        super(nome, iD);
    }
    
    @Override
    public void liberaAcessoOficina() {
        System.out.println( "Estudante " + getNome() + " entra na oficina." );
    }

    @Override
    public boolean temAcessoPesado() {
        return false;
    }

    @Override
    public int getIDPessoa() {
        return getID();
    }
}
