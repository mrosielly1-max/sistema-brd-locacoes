// Nome do arquivo deve ser exatamente: Equipamento.java

/**
 * Camada MODEL: Representa o maquinário ou ativo de locação.
 */
public class Equipamento {
    private int id;
    private String nome;
    private String status;
    private double valorTotal;

    // Construtor para definir as características da máquina
    public Equipamento(int id, String nome, String status, double valorTotal) {
        this.id = id;
        this.nome = nome;
        this.status = status;
        this.valorTotal = valorTotal;
    }

    // Métodos Getters e Setters para acesso seguro aos dados
    public String getNome() {
        return nome;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
