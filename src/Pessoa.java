/**
 * Classe abstrata que representa uma Pessoa.
 * Contém propriedades comuns para Pessoa Física e Jurídica.
 *
 * @author Natalia
 * @version 1.0
 */
public abstract class Pessoa {

    // Propriedades comuns
    private String nome;
    private String endereco;
    private String telefone;

    // Construtor
    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Método abstrato (cada subclasse implementa de forma diferente)
    public abstract void exibirDados();
}