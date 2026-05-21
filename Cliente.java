// Nome do arquivo deve ser exatamente: Cliente.java

/**
 * Camada MODEL: Representa a entidade Cliente no sistema.
 */
public class Cliente {
    private String cnpj;
    private String razaoSocial;

    // Construtor para inicializar o cliente
    public Cliente(String cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    // Métodos Getters e Setters (Encapsulamento)
    public String getCnpj() {
        return cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }
}
