package view;


import model.Frota;
import model.Carro;
import model.Moto;
import model.Veiculo;
// Main.java

public class Main {
    public static void main(String[] args) {
        Frota frota = new Frota(); // Cria uma nova frota

        // Criando alguns veículos
        Carro carro1 = new Carro("Toyota", "Corolla", 2020, 4);
        Moto moto1 = new Moto("Honda", "CB500", 2021, "Sport");


        // Adicionando veículos à frota
        frota.adicionarVeiculo(carro1);
        frota.adicionarVeiculo(moto1);

        // Exibindo detalhes da frota
        System.out.println("Detalhes da frota:");
        frota.exibirDetalhesFrota();
    }
}
