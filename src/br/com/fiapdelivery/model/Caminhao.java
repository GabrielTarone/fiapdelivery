package br.com.fiapdelivery.model;

public class Caminhao extends Veiculo {

    private int numEixos;

    // Construtor
    public Caminhao(String placa, String modelo, double capacidadeCarga, int numEixos) {
        super(placa, modelo, capacidadeCarga);
        // Validação: caminhão deve ter pelo menos 2 eixos
        if (numEixos >= 2) {
            this.numEixos = numEixos;
        } else {
            System.out.println("Um caminhão deve ter pelo menos 2 eixos.");
        }
    }

    // Getter
    public int getNumEixos() {
        return numEixos;
    }
}