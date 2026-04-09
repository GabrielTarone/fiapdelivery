package br.com.fiapdelivery.main;
import br.com.fiapdelivery.model.*;

public class Principal {

    public static void main(String[] args) {

    // Criando um pacote
    Pacote pacote = new Pacote("GTTH05", 10.5);

    // Criando um veículo (caminhão)
    Veiculo veiculo = new Caminhao("JOR4561", "Volvo", 5000, 6);

    // Criando a rota de entrega
    Rota rota = new Rota(pacote, veiculo);

        // Executando a entrega    
        rota.iniciarEntrega();
    }
}