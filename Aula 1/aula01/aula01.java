
public class aula01 {

    public static void main(String[] args) {
        
        Carro c1 = new Carro( 2013, "Vermelho", 2.0, "HB20", "Hyundai", true );
        c1.mostraInfo();
        c1.carroAnda();
        c1.mostraIdade();

        Carro c2 = new Carro( 2015, "Verde", 1.0, "HB20", "Hyundai", false );
        c2.mostraInfo();
        c2.carroAnda();
        c2.mostraIdade();

        Carro c3 = new Carro( 2011, "Azul", 1.5, "HB20", "Hyundai", false );
        c3.mostraInfo();
        c3.carroAnda();
        c3.mostraIdade();


        for( int i = 0; i < 11; i++ ){
            c1.carroAnda();
        }
        c1.abastecer();
        c1.carroAnda();



        //Carro c2 = new Carro();

    }
}