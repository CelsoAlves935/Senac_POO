import java.util.HashMap;
import java.util.Map;

public class Portaria {

    Map< Integer, Pessoa > pessoas = new HashMap();

    public void adicionaPessoa( Pessoa p ){
        pessoas.put( p.getID(), p );
    }
    
    public void liberaAcesso( int ID ){
        pessoas.get(ID).liberaAcesso();
    }

}
