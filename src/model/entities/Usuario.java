package model.entities;
import java.util.Scanner;

import interfaces.UserPolicy;

public abstract class Usuario implements UserPolicy {

    protected String nome;
    protected String cpf;

    public Usuario(){

    }

    public Usuario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public abstract int prazoDevolucao();

    @Override
    public void novoUsuario(Scanner sc){
        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("CPF: ");
        cpf = sc.nextLine();
    }
}
