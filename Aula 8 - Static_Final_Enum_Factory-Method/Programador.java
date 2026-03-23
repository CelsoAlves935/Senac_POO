public abstract class Programador extends Profissional {
    
    private static final int SALARIO_BASE = 3000;

    @Override
    public final int getSalario(){
        return SALARIO_BASE;
    }


}
