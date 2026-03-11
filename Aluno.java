public class Aluno extends Usuario {

    private String matricula;

    public Aluno(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    @Override
    public int prazoDevolucao() {
        return 15;
    }
}
