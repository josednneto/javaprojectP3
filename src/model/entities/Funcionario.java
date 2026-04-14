package model.entities;

import java.util.Scanner;

public class Funcionario extends Usuario {
    protected String cargo;

    public Funcionario(){

    }
    public Funcionario(String nome, String cpf, String cargo) {
        super(nome, cpf);
        this.cargo = cargo;
    }
    
    @Override
    public int prazoDevolucao() {
    	return 7;
    }

    @Override
    public void novoUsuario(Scanner sc){
        super.novoUsuario(sc);
        System.out.print("Cargo: ");
        cargo = sc.nextLine();
    }
}
