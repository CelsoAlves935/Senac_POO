import java.util.HashMap;
import java.util.Map;

public class SistemaDeEnsino {
    
    Map< Integer, Aluno > alunos = new HashMap();

    public void adicionaAluno( Aluno a ){
        alunos.put( a.getID(), a );
    }

    public void fazAvaliacao( int ID, double nota ){
        alunos.get(ID).fazAvaliacao(nota);
    }

}
