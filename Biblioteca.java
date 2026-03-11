import java.util.List;
import java.util.ArrayList;

public class Biblioteca {

    private List<Usuario> usuarios = new ArrayList<>();
    private List<Livro> livros = new ArrayList<>();

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarUsuarios() {
        for(Usuario u : usuarios) {
            u.exibirDados();
        }
    }
}
