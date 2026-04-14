package model.entities;

import java.util.Scanner;

public class Professor extends Funcionario {

    private String departamento;

    public Professor(){

    }

    public Professor(String nome, String cpf, String cargo, String departamento) {
        super(nome, cpf, cargo);
        this.departamento = departamento;
    }

    public String getDepartamento() {
    	return departamento;
    }
    
    @Override
    public int prazoDevolucao() {
        return 30;
    }

    @Override
    public void novoUsuario(Scanner sc){
        super.novoUsuario(sc);
        System.out.print("Departamento: ");
        departamento = sc.nextLine();
    }
}
