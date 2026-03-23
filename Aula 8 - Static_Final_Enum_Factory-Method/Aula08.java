public class Aula08 {

    public static void main( String args[] ){
        
        //--Parte1
        //---------------------------------

        double raizDe2 = Math.sqrt(2.0);
        System.out.println( raizDe2 );

        double tresAoQuadrado = Math.pow(3.0,2.0);
        System.out.println( tresAoQuadrado );

        double pi = Math.PI;
        System.out.println( pi );

        //Matematica.PI = 5.0;
        pi = Matematica.PI;
        System.out.println( pi );
        System.out.println( Matematica.pow(3.0,2) );

        //Matematica objetoMatematica = new Matematica();
        //pi = objetoMatematica.PI;
        //Math math = new Math();


        //--Parte2
        //------------------------------------
        Engenheiro engMecanico = 
            new Engenheiro(Engenheiros.Mecanico);
        Engenheiro engEletricista =
            new Engenheiro(Engenheiros.Eletricista);
        Engenheiro engDados =
            new Engenheiro(Engenheiros.Dados);
        Engenheiro engCivil =
            new Engenheiro(Engenheiros.Civil);
        Programador progBackEnd =
            new BackEnd();
        Programador progFrontEnd = 
            new FrontEnd();

        engMecanico.MostraEspecialidade();
        engEletricista.MostraEspecialidade();
        engDados.MostraEspecialidade();
        engCivil.MostraEspecialidade();



        Profissional p1 = 
            Profissional.CriaProfissional(
                ListaDeProfissionais.ProgramadorFrontEnd
                );
        p1.fazServico();
        p1.getSalario();
        p1.tipoDeContrato();
        
        Profissional p2 =
            Profissional.CriaProfissional(
                ListaDeProfissionais.EngenheiroCivil
            );
        //p2.getEspecialidade();
    }

}