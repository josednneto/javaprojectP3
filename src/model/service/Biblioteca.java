package model.service;

import java.util.ArrayList;
import java.util.List;

import model.entities.Emprestimo;
import model.entities.Livro;
import model.entities.Usuario;

public class Biblioteca {
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Livro> livros = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    
    
    public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void emprestarLivro(Usuario usuario, Livro livro) {

        if (livro.isDisponivel()) {

            livro.emprestar();

            Emprestimo emprestimo = new Emprestimo(usuario, livro);
            emprestimos.add(emprestimo);

            System.out.println("Livro emprestado: " + livro.getTitulo());
            System.out.println("Usuário: " + usuario.getNome());
            System.out.println("Prazo: " + usuario.prazoDevolucao() + " dias");

        } else {
            System.out.println("Livro indisponível");
        }
    }


    public void devolverLivro(Livro livro) {

        for (Emprestimo e : emprestimos) {

            if (e.getLivro() == livro) {

                livro.devolver();
                emprestimos.remove(e);

                System.out.println("Livro devolvido: " + livro.getTitulo());
                return;
            }
        }

        System.out.println("Esse livro não está emprestado.");
    }

    public void relatorio() {
        System.out.println(">>> LIVROS DA BIBLIOTECA");
        for(Livro i : livros) {
            System.out.println("Título: " + i.getTitulo());
            if(i.isDisponivel()) {
                System.out.println("Situação: Disponível");
            } else {
                System.out.println("Situação: Indisponível");
            }
        }

        System.out.println();
        System.out.println(">>> USUÁRIOS E SITUAÇÃO");

        for(Usuario u : usuarios) {
            System.out.println("Nome: " + u.getNome());

            if(emprestimos.size() == 0) {
                System.out.println("> Nenhum empréstimo.");
            } else {

                boolean temEmprestimo = false;

                for(Emprestimo e : emprestimos) {
                    if(e.getUsuario() == u) {
                        temEmprestimo = true;

                        System.out.println("> Consta empréstimo.");
                        Livro l = e.getLivro();
                        System.out.println("Livro emprestado: " + l.getTitulo());
                        System.out.println("Prazo de devolução: " + u.prazoDevolucao() + " dias.");
                    }
                }

                if(!temEmprestimo) {
                    System.out.println("> Nenhum empréstimo.");
                }
            }

            System.out.println();
        }
    }
}
