
public class Aula04 {
    public static void main(String[] args) {
        
        Produto p1 = new Produto("Batata", 1, 50, 100);
        System.out.println(p1.getNome());
        System.out.println(p1);

        Caixa c1 = new Caixa(p1);
        c1.fazCompra(50.0);
        System.out.println(c1);

        Produto arroz = new Produto("Arroz", 1, 10, 101);
        Caixa c2 = new Caixa(arroz);
        c2.fazCompra(80);
        System.out.println(c2);

            

    }
}
