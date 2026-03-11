public class Professor extends Usuario {

    private String departamento;

    public Professor(String nome, String cpf, String departamento) {
        super(nome, cpf);
        this.departamento = departamento;
    }

    @Override
    public int prazoDevolucao() {
        return 30;
    }
}
