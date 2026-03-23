import java.util.HashMap;
import java.util.Map;

public class Oficina {
    
    Map<Integer,Mecanica> mecanicos = new HashMap();

    public void adicionaMecanico( Mecanica m ){
        mecanicos.put( m.getIDPessoa(), m );
    }

    public void liberaAcesso( int ID ){
        Mecanica m = mecanicos.get(ID);
        if(m.temAcessoPesado()){
            System.out.println("Acesso Pesado");
        } else {
            System.out.println("Acesso Restrito");
        }
        m.liberaAcessoOficina();
    }

}
