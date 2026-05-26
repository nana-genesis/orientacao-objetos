/**
 * Classe principal para testar o sistema de Pessoas.
 *
 * @author Natalia
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== TESTE DE HERANÇA ===\n");

        // Criando uma Pessoa Física
        PessoaFisica pf = new PessoaFisica(
                "João Silva",
                "Rua A, 123 - São Paulo/SP",
                "(11) 99999-9999",
                "123.456.789-00",
                "12.345.678-9",
                "15/05/1990"
        );

        // Criando uma Pessoa Jurídica
        PessoaJuridica pj = new PessoaJuridica(
                "Tech Solutions Ltda",
                "Av. Paulista, 1000 - São Paulo/SP",
                "(11) 3333-4444",
                "12.345.678/0001-99",
                "123.456.789.123",
                "Tech Solutions Ltda",
                "Tech Solutions"
        );

        // Exibindo os dados
        pf.exibirDados();
        pj.exibirDados();
    }
}
