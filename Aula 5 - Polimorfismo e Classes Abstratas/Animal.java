public abstract class Animal {

    private String nome;
    private Double peso;
    private String especie;
    private Double valorDaConsulta = 100.0;
    private Double valorDoExame = 50.0;
    
   

    public Animal(String nome, Double peso, String especie) {
        this.nome = nome;
        this.peso = peso;
        this.especie = especie;
    }


    public abstract void fazBarulho();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Double getValorDaConsulta() {
        return valorDaConsulta;
    }

    public void setValorDaConsulta(Double valorDaConsulta) {
        this.valorDaConsulta = valorDaConsulta;
    }

    public Double getValorDoExame() {
        return valorDoExame;
    }

    public void setValorDoExame(Double valorDoExame) {
        this.valorDoExame = valorDoExame;
    }

    @Override
    public String toString() {
        return "Animal [nome=" + nome + ", peso=" + peso + ", especie=" + especie + ", valorDaConsulta="
                + valorDaConsulta + ", valorDoExame=" + valorDoExame + "]";
    }

    // @Override
    // public String toString() {
    //     StringBuilder sc
    // }

    
    
    


}