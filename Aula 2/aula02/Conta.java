public class Conta {
    private int numeroConta;
    private double saldo;


    public Conta(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }


    public int getNumeroConta() {
        return numeroConta;
    }



    public double getSaldo() {
        return saldo;
    }


    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public String sacar(double valor) {
        if (this.saldo < valor) {
            return "Valor insuficiente";
        }
        this.saldo -= valor;
        return "Saldo atual " + this.saldo;
    }



    

      
}
