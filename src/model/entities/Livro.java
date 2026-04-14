package model.entities;

import java.util.Scanner;

public class Livro {

    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(){
        this.disponivel = true;
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
    	return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar() {
        disponivel = false;
    }

    public void devolver() {
        disponivel = true;
    }

    public void novoLivro(Scanner sc){
        System.out.print("Título: ");
        titulo = sc.nextLine();
        System.out.print("Autor: ");
        autor = sc.nextLine();
    }
}
