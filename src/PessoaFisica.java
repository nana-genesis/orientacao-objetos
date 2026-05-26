/**
 * Classe concreta que representa uma Pessoa Física (CPF).
 * Herda da classe abstrata Pessoa.
 *
 * @author Natalia
 * @version 1.0
 */
public class PessoaFisica extends Pessoa {

    // Propriedade específica de Pessoa Física
    private String cpf;
    private String rg;
    private String dataNascimento;

    // Construtor
    public PessoaFisica(String nome, String endereco, String telefone,
                        String cpf, String rg, String dataNascimento) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public void exibirDados() {
        System.out.println("\n=== PESSOA FÍSICA ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Data Nascimento: " + dataNascimento);
    }
}