public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Aluno aluno = new Aluno("Arthur", "111", "2023001");
        Professor professor = new Professor("Batista", "222", "Computação");

        Livro livro = new Livro("Java POO", "Deitel");

        biblioteca.adicionarUsuario(aluno);
        biblioteca.adicionarUsuario(professor);

        biblioteca.adicionarLivro(livro);

        Emprestimo emprestimo = new Emprestimo(aluno, livro);

        emprestimo.realizarEmprestimo();
    }
}
