package br.com.fiapdelivery.model;

public class Moto extends Veiculo {

    private boolean temBau;

    // Construtor
    public Moto(String placa, String modelo, double capacidadeCarga, boolean temBau) {
        super(placa, modelo, capacidadeCarga);

        // Validação: limite de carga para motos
        if (capacidadeCarga <= 0 || capacidadeCarga > 50) {
            System.out.println("Moto deve ter capacidade entre 1 e 50kg.");
    }
        this.temBau = temBau;
    }

    // Getter
    public boolean temBau() {
        return temBau;
    }
}