public class Caixa {
    private Produto produto;

    public Caixa(Produto produto) {
        this.produto = produto;
    }

    public void fazCompra( double valor ) {

        System.out.println("\n#########");

        if (valor < produto.getPreco()) {
            System.out.println("Valor Insuficiente !!!");
        } else {
            produto.fazCompra();
            double troco = valor - produto.getPreco();
            System.out.println("Troco: R$ " + troco);
        }
    }
    

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Caixa [produto=" + produto + ", getProduto()=" + getProduto() + ", getClass()=" + getClass()
                + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }

    
}


