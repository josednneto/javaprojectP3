public class Usuario implements Prazo{

    protected String nome;
    protected String cpf;

    public Usuario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
    
    @Override
    public int prazoDevolucao() {
        return 7;
    }
}
