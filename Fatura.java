// Nome do arquivo deve ser exatamente: Fatura.java

import java.util.ArrayList;

/**
 * Camada MODEL: Centraliza as regras de negócio e cálculos matemáticos.
 */
public class Fatura {
    private int numeroFatura;
    private Cliente cliente; // Associação entre classes
    private ArrayList<Equipamento> itens;

    public Fatura(int numeroFatura, Cliente cliente) {
        this.numeroFatura = numeroFatura;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Equipamento equipamento) {
        this.itens.add(equipamento);
    }

    // Método polimórfico/calculável para somar os totais da fatura
    public double calcularValorTotal() {
        double total = 0;
        for (Equipamento item : itens) {
            total += item.getValorTotal();
        }
        return total;
    }

    public int getNumeroFatura() {
        return numeroFatura;
    }
}
