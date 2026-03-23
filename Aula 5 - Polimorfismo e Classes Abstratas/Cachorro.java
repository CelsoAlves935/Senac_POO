public class Cachorro extends Animal {
    private int fatorPesoExame = 2;
    private Double pesoReferencia = 20.0;
    private Double adicionalCachorroPesado = 70.0;


    

    public Cachorro(String nome, Double peso, String especie) {
        super(nome, peso, especie);
    }

    @Override
    public void fazBarulho() {
        System.out.println("AUUUUUUUUU");
    }

    @Override
    public Double getValorDaConsulta() {
        if (getPeso() >= pesoReferencia) {
            return super.getValorDaConsulta() + this.adicionalCachorroPesado;
        } else {
            return super.getValorDaConsulta()
        }
    }

    @Override
    public Double getValorDoExame() {
        return super.getValorDoExame() + this.fatorPesoExame * getPeso();
    }
}
