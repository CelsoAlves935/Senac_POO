public class aula02 {
    
    public static void main( String args[] ){
        
        //--PARTE 1
        Pessoa p1 = new Pessoa( "Joao", 30 );
        p1.fazAniversario();
        if( p1.getMaioridade() ){
            p1.mostraInfo();
        }

        Pessoa p2 = new Pessoa( "Maria", 35 );
        p2.fazAniversario();
        if( p2.getMaioridade() ){
            p2.mostraInfo();
        }

        Pessoa p3 = new Pessoa( null, -10 );
        p3.fazAniversario();
        if( p3.getMaioridade() ){
            p3.mostraInfo();
        }



        //--------PARTE 2
        System.out.println("\n########################\n");

        ContaBancaria c1 = new ContaBancaria("Pedro");
        //--Teste:
        c1.fechar();
        c1.abrir();
        c1.abrir();

        c1.depositar(1000);
        c1.sacar(5000);
        c1.sacar(500);

        ContaBancaria c2 = new ContaBancaria("Maria");
        c2.abrir();
        c2.depositar(5000);

    }

}
