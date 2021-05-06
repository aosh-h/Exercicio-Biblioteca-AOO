public class Main {
   
    public static void main (String[] args){

        Autor autor1 = new Autor("Stephen Hawking", "Reino Unido");
        Autor autor2 = new Autor("Stephen Covey", "Estados Unidos");
        Aluno aluno = new Aluno("João Vitor", "abc");
        Professor professor = new Professor("Efrain", "def");
     
        

        Livro livro1 = new Livro("Uma breve história do tempo" , autor1);
        livro1.setEmprestadoPor(aluno);
        Livro livro2 = new Livro("Os 7 hábitos das pessoa altamente eficazes", autor2);
        livro2.setEmprestadoPor(professor);

        System.out.println("Nome do livro: " + livro1.nome + "\nNome do autor: " + autor1.nome);
        System.out.println("Nacionalidade do autor: " + autor1.nacionalidade);
        System.out.println("Emprestado por: " + aluno.nome + "\nCód. de acesso: " + aluno.codigo);
        System.out.println("\nNome do livro: " + livro2.nome + "\nNome do autor: " + autor2.nome );
        System.out.println("Nacionalidade do autor: " + autor2.nacionalidade);
        System.out.println("Emprestado por: " + professor.nome + "\nCód. de acesso: " + professor.codigo);
        

        
    }
}
