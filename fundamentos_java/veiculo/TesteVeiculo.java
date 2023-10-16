package veiculo;

public class TesteVeiculo {
   public static void main(String[] args) {
   // Carro carro = new Carro();
    Veiculo carro = new Carro();
    carro.acelerar();
    carro.frear();

    Veiculo moto = new Moto();
    moto.acelerar();
    moto.frear();
   }
}
