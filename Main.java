// Nome do arquivo deve ser exatamente: Main.java

/**
 * Classe de Execução Principal. Simula a integração entre a interface (View)
 * e as regras de negócio controladas (Model).
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("====== INICIANDO SISTEMA BRD LOCAÇÕES ======");

        // 1. Instanciando dados simulados com base na Fatura N° 002
        Cliente cliente = new Cliente("59.073.936/0001-95", "CONSÓRCIO SUBADUTORA CUBATAO");
        Equipamento maquina = new Equipamento(101, "LOCAÇÃO DE MAQUINA DE TERMOFUSÃO 355MM", "Disponível", 7000.00);

        // 2. Criando o documento de faturamento através da lógica de objetos
        Fatura fatura = new Fatura(2, cliente);
        fatura.adicionarItem(maquina);
        
        // Alterando o status do ativo no estoque de forma segura
        maquina.setStatus("Locado");

        // 3. Exibindo os resultados processados (Simulação da saída na View)
        System.out.println("\n-------------------------------------------");
        System.out.println("FATURA EMITIDA COM SUCESSO NO PADRÃO MVC");
        System.out.println("Fatura Número: 00" + fatura.getNumeroFatura());
        System.out.println("Cliente Administrativo: " + cliente.getRazaoSocial());
        System.out.println("Serviço: " + maquina.getNome());
        System.out.println("Valor Consolidado: R$ " + fatura.calcularValorTotal());
        System.out.println("Status Atual do Equipamento: " + maquina.getStatus());
        System.out.println("-------------------------------------------");
        System.out.println("====== PROCESSO FINALIZADO SEM ERROS ======");
    }
}
