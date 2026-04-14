package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.entities.Aluno;
import model.entities.Funcionario;
import model.entities.Livro;
import model.entities.Professor;
import model.entities.Usuario;
import model.service.Biblioteca;

public class Menu {
    private Biblioteca biblioteca = new Biblioteca();
	private Scanner sc = new Scanner(System.in);

    public void executar(){
        int opcao;

        try {	
        	do {
                mostrarMenu();
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        adicionarUsuario();
                        break;
                    case 2:
                        adicionarLivro();
                        break;
                    case 3:
                        emprestarLivro();
                        break;
                    case 4:
                        devolverLivro();
                        break;
                    case 5:
                        biblioteca.relatorio();
                        break;
                    case 0:
                        System.out.println("Encerrando o programa...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }

            } while (opcao != 0);
        }
        catch(InputMismatchException e) {
        	System.out.println("Valor inválido!");
        	System.out.println("Programa encerrado.");
        }
    }

    private void mostrarMenu() {
        System.out.println("=== MENU ===");
        System.out.println("1 - Adicionar usuário");
        System.out.println("2 - Adicionar livro");
        System.out.println("3 - Emprestar livro");
        System.out.println("4 - Devolver livro");
        System.out.println("5 - Relatório");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");
    }

    private void adicionarUsuario() {
        int tipo;
        
        do {
        	System.out.println("1 - Aluno");
            System.out.println("2 - Professor");
            System.out.println("3 - Funcionario");
            System.out.println(": ");
            tipo = sc.nextInt();
            sc.nextLine();
            
            if(tipo < 1 || tipo > 3) {
            	System.out.println("Opção inválida!");
            }
        }while(tipo < 1 || tipo > 3);
        
        Usuario usuario = null;
        if (tipo == 1) {
        	Aluno aluno = new Aluno();
            aluno.novoUsuario(sc);
        	usuario = aluno;
        }
        else if (tipo == 2) {
            Professor professor = new Professor();
            professor.novoUsuario(sc);
            usuario = professor;
        }
        else if (tipo == 3) {
            Funcionario funcionario = new Funcionario();
            funcionario.novoUsuario(sc);
            usuario = funcionario;
        }

        if (usuario != null) {
            biblioteca.adicionarUsuario(usuario);
            System.out.println("Usuário adicionado!");
        }
    }

    private void adicionarLivro() {
        Livro livro = new Livro();
        livro.novoLivro(sc);

        biblioteca.adicionarLivro(livro);
        System.out.println("Livro adicionado!");
    }

    private void emprestarLivro() {
        System.out.print("Nome do usuário: ");
        String nome = sc.nextLine();

        System.out.print("Título do livro: ");
        String titulo = sc.nextLine();

        Usuario u = buscarUsuario(nome);
        Livro l = buscarLivro(titulo);

        if (u != null && l != null) {
            biblioteca.emprestarLivro(u, l);
        } else {
            System.out.println("Usuário ou livro não encontrado.");
        }
    }

    private void devolverLivro() {
        System.out.print("Título do livro: ");
        String titulo = sc.nextLine();

        Livro l = buscarLivro(titulo);

        if (l != null) {
            biblioteca.devolverLivro(l);
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    private Usuario buscarUsuario(String nome) {
        for (Usuario u : biblioteca.getUsuarios()) {
            if (u.getNome().equalsIgnoreCase(nome)) {
                return u;
            }
        }
        return null;
    }

    private Livro buscarLivro(String titulo) {
        for (Livro l : biblioteca.getLivros()) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                return l;
            }
        }
        return null;
    }
}
