package model;

// Frota.java

import java.util.ArrayList; // Importa a classe ArrayList

public class Frota {
    private ArrayList<Veiculo> veiculos; // Lista de veículos

    // Construtor da classe Frota
    public Frota() {
        veiculos = new ArrayList<>(); // Inicializa a lista de veículos
    }

    // Método para adicionar um veículo à frota
    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo); // Adiciona o veículo à lista
    }

    // Método para exibir detalhes de todos os veículos na frota
    public void exibirDetalhesFrota() {
        if (veiculos.isEmpty()) {
            System.out.println("A frota está vazia."); // Verifica se a lista está vazia
            return;
        }

        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo.exibirDetalhes()); // Exibe detalhes de cada veículo
        }
    }
}
