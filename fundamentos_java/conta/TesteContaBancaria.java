package conta;

public class TesteContaBancaria {
    public static void main(String[] args) {
            ContaBancaria contaBancaria = new ContaBancaria();
            contaBancaria.setNumero("12345");
            contaBancaria.setTitular("Maria");
            contaBancaria.setSaldo(100);

            System.out.println("O numero da conta é: " + contaBancaria.getNumero());
            System.out.println(contaBancaria.toString());

            contaBancaria.depositar(200);
            contaBancaria.sacar(120);

    }
    
}
