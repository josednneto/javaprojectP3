package model.entities;
import java.util.Scanner;

public class Aluno extends Usuario {

    private String matricula;

    public Aluno(){

    }

    public Aluno(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }	
    
    public String getMatricula() {
    	return matricula;
    }
    
    @Override
    public int prazoDevolucao() {
        return 15;
    }

    @Override
    public void novoUsuario(Scanner sc){
        super.novoUsuario(sc);
        System.out.print("Matricula: ");
        matricula = sc.next();
    }
}
