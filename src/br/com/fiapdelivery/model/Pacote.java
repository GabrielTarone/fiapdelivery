package br.com.fiapdelivery.model;

public class Pacote {

    private String codigo;
    private double peso;
    private String status;

    // Construtor
    public Pacote(String codigo, double peso) {
        // Validação do código
        if (codigo == null || codigo.trim().isEmpty()) {
            System.out.println("Código inválido.");
        }
        else {
            this.codigo = codigo;
        }
        // Validação do peso
        if (peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("Peso inválido");
        }
        this.status = "Pendente"; // PENDENTE, ENVIADO, ENTREGUE
    }

    // Getters código, peso e status da entrega
    public String getCodigo() {
        return codigo;
    }

    public double getPeso() {
        return peso;
    }

    public String getStatus() {
        return status;
    }

    // Atualiza o status do pacote
    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }
}