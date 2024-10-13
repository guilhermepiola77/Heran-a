package model;

// Veiculo.java

public class Veiculo {
    protected String marca; // Marca do veículo
    protected String modelo; // Modelo do veículo
    protected int ano;      // Ano do veículo

    // Construtor da classe Veiculo
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método para exibir detalhes do veículo
    public String exibirDetalhes() {
        return marca + " " + modelo + ", Ano: " + ano;
    }
}
