public class ContaBancaria {
    
    private String titular;
    private int saldo = 0;
    private boolean contaAberta = false;

    ContaBancaria( String titular ){
        this.titular = titular;
        System.out.println( titular + " cadastrado com sucesso." );
    }

    public void abrir(){
        if( this.contaAberta ){
            System.out.println("A conta já está aberta");
        } else {
            this.contaAberta = true;
            System.out.println("Conta aberta com sucesso.");
        }
    }

    public void fechar(){
        if( this.contaAberta ){
            this.contaAberta = false;
            System.out.println("Conta fechada!");
        } else {
            System.out.println("A conta já está fechada.");
        }
    }

    public void mostraSaldo(){
        System.out.println("Saldo total: R$" + saldo + ",00");
    }

    public void sacar( int valor ){
        if( this.contaAberta ){
            if( valor <= this.saldo ){
                this.saldo -= valor;
                System.out.println("Saque realizado com sucesso.");
                mostraSaldo();
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("A conta tá fechada.");
        }
    }
    public void depositar( int valor ){
        if( this.contaAberta ){
            this.saldo += valor;
            System.out.println("Deposito realizado com sucesso.");
            mostraSaldo();
        } else {
            System.out.println("A conta tá fechada!");
        }
    }

}
