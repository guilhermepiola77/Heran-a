package model;

// Moto.java

public class Moto extends Veiculo {
    private String tipo; // Tipo da moto (ex: Sport, Cruiser)

    // Construtor da classe Moto
    public Moto(String marca, String modelo, int ano, String tipo) {
        super(marca, modelo, ano); // Chama o construtor da classe base
        this.tipo = tipo; // Define o tipo da moto
    }

    // Sobrescreve o método para exibir detalhes da moto
    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() + ", Tipo: " + tipo;
    }
}

