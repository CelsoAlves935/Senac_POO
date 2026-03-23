public class Moto implements Veiculo {

    private String marca;
    private int ano;

    public Moto(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public void daGrau(){
        System.out.println("Moto dando grau");
    }

    @Override
    public void acelera() {
        System.out.println("Moto acelerando.");
        
    }

    @Override
    public void anda() {
        System.out.println("Moto andando.");
    }

    @Override
    public void freia() {
        System.out.println("Moto freiando.");
    }
    
}
