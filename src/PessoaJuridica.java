/**
 * Classe concreta que representa uma Pessoa Jurídica (CNPJ).
 * Herda da classe abstrata Pessoa.
 *
 * @author Natalia
 * @version 1.0
 */
public class PessoaJuridica extends Pessoa {

    // Propriedades específicas de Pessoa Jurídica
    private String cnpj;
    private String inscricaoEstadual;
    private String razaoSocial;
    private String nomeFantasia;

    // Construtor
    public PessoaJuridica(String nome, String endereco, String telefone,
                          String cnpj, String inscricaoEstadual,
                          String razaoSocial, String nomeFantasia) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
    }

    // Getters e Setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    @Override
    public void exibirDados() {
        System.out.println("\n=== PESSOA JURÍDICA ===");
        System.out.println("Razão Social: " + razaoSocial);
        System.out.println("Nome Fantasia: " + nomeFantasia);
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Inscrição Estadual: " + inscricaoEstadual);
    }
}