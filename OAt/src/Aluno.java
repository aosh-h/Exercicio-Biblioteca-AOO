
public class Aluno extends Pessoa {
    
    String codigo;
    public Aluno (String nome, String codigo){
        super(nome, codigo);
        this.codigo = codigo;
    }
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
   
}