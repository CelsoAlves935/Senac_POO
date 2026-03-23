public class Produto {
    private String nome;
    private int quantidade;
    private double precoUnitario;
    private int codigoDeBarras;
    
    public Produto(String nome, int quantidade, double precoUnitario, int codigoDeBarras) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.codigoDeBarras = codigoDeBarras;
    }

    public double getPreco() {
        return this.precoUnitario * this.quantidade;
    }

    public void fazCompra() {
        System.out.println(this.quantidade + " " +
                            this.nome + " por R$" +
                            this.getPreco());
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnidade() {
        return precoUnitario;
    }

    public void setPrecoUnidade(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(int codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }
    
    @Override
    public String toString() {
        String str = "Produto{" +
            "nome=" + nome +
            ", quantidade=" + quantidade +
            ", precoUnitario=" + precoUnitario +
            ", codigoDeBarras" + codigoDeBarras +
            ")";
        return str;        
    }
}
