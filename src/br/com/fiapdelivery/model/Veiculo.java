package br.com.fiapdelivery.model;

// Classe base (superclasse) para todos os veículos
public class Veiculo {

    private String placa;
    private String modelo;
    private double capacidadeCarga;

    public Veiculo(String placa, String modelo, double capacidadeCarga) {
        this.setPlaca(placa); // validação da placa
        this.modelo = modelo;
        this.setCapacidadeCarga(capacidadeCarga); // validação da capacidade
    }

    // Getters da placa, modelo e capacidade
    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    // Valida e define a placa
    private void setPlaca(String novaPlaca) {
        if (novaPlaca != null && !novaPlaca.trim().isEmpty()) {
            this.placa = novaPlaca;
        } else {
            System.out.println("Placa inválida!");
        }
    }

    // Valida e define a capacidade
    private void setCapacidadeCarga(double capacidadeCarga) {
        if (capacidadeCarga > 0) {
            this.capacidadeCarga = capacidadeCarga;
        } else {
            System.out.println("Capacidade deve ser maior que zero.");
        }
    }
}