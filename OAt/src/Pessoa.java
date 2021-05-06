public abstract class Pessoa {
    public String nome;
        
    public Pessoa (String nome, String nacionalidade){
        
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
