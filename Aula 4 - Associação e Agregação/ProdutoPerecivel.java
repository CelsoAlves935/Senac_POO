public class ProdutoPerecivel extends Produto{

    private int validade;
    private int dia;
    

    public ProdutoPerecivel(String nome, 
                            int quantidade, 
                            double precoUnitario, 
                            int codigoDeBarras,
                            int validade,
                            int dia) {
        super(nome, quantidade, precoUnitario, codigoDeBarras);
        this.validade = validade;
        this.dia = dia;
        
        //TODO Auto-generated constructor stub
    }

    
}
