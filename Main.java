public class Program {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Aluno aluno = new Aluno("Carlos", "111", "2023001");
        Professor professor = new Professor("Ana", "222", "Computação");

        Livro livro1 = new Livro("Java POO", "Deitel");
        Livro livro2 = new Livro("Entendendo Algoritmos", "Aditya Y.");
        
        biblioteca.adicionarUsuario(aluno);
        biblioteca.adicionarUsuario(professor);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        
        biblioteca.emprestarLivro(aluno, livro1);
        biblioteca.emprestarLivro(professor, livro2);
        System.out.println();

        biblioteca.devolverLivro(livro1);
        
        System.out.println();
        biblioteca.relatorio();
    }
