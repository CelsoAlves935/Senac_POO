public class Pessoa {
    private String nome;
    private int idade;

    //--Constructor
    Pessoa( String _nome, int _idade ) {
        setNome(_nome);
        setIdade(_idade);
    }

    public boolean getMaioridade(){
        return getIdade() >= 18;
        //if( getIdade() >= 18 ){
        //    return true;
        //} else {
        //    return false;
        //}
    }

    public void fazAniversario() {
        //this.idade = this.idade + 1;
        setIdade( getIdade() + 1 );
    }

    public void mostraInfo() {
        System.out.println( getNome() + ", " + 
                            getIdade() + " anos de idade." );
    }

    private void setNome( String _nome ){
        this.nome = _nome;
    }
    private String getNome(){
        if( this.nome == null ){
            return "SemNome";
        }
        return this.nome;
    }

    private void setIdade( int _idade ){
        if( _idade < 0 ){
            _idade = 0;
        }
        this.idade = _idade;
    }
    private int getIdade(){
        return this.idade;
    }
}
