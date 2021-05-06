
public class Livro {
    String nome;
    public Autor autor;
    public Pessoa emprestadoPor;

    public Livro(String nome, Autor autor){
        this.nome = nome;
        this.autor = autor;
    }
    
    public Autor getAutor(){
        return autor;

    }
    public void setAutor(Autor autor){
        this.autor = autor;

    }
    public Pessoa getEmprestadoPor(){
        return this.emprestadoPor;
    }
    public void setEmprestadoPor(Pessoa emprestadoPor){
        this.emprestadoPor = emprestadoPor;
    }
    
   
}
