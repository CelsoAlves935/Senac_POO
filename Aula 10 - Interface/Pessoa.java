public abstract class Pessoa {
    
    private String nome;
    private int ID;
    
    public Pessoa(String nome, int iD) {
        this.nome = nome;
        this.ID = iD;
    }


    public void liberaAcesso(){
        System.out.println(this.nome + " está liberado.");
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

}
