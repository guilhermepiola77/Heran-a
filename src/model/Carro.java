package model;

// Carro.java

public class Carro extends Veiculo {
    private int numeroDePortas; // Número de portas do carro

    // Construtor da classe Carro
    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano); // Chama o construtor da classe base
        this.numeroDePortas = numeroDePortas; // Define o número de portas
    }

    // Sobrescreve o método para exibir detalhes do carro
    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() + ", Portas: " + numeroDePortas;
    }
}
