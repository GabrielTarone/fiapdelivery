package br.com.fiapdelivery.model;

// Classe que representa a entrega (associação entre pacote e veículo)
public class Rota {

    private Pacote pacote;
    private Veiculo veiculo;

    // Construtor
    public Rota(Pacote pacote, Veiculo veiculo) {
        this.pacote = pacote;
        this.veiculo = veiculo;
        
        // Validação: não pode ser nulo
        if (pacote == null || veiculo == null) {
            System.out.println("Rota precisa de pacote e veículo.");
}
    }

    // Método que simula a entrega
    public void iniciarEntrega() {
        System.out.println();
        System.out.println("Levando pacote " + pacote.getCodigo() +
                " no veiculo " + veiculo.getPlaca());
                System.out.println();
    }
}