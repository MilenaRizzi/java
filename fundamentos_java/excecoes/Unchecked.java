package excecoes;

public class Unchecked {
    public static void main(String[] args) throws Exception {
        
        try{
            validarNumero();
    
        } catch (Exception e){
            System.out.println("Deu ruim");
            //detalha o erro
            e.printStackTrace();
        }
    }
    public static void validarNumero() throws Exception {
        int numero = 10;
        if(numero < 100) {
            throw new Exception("O número é menor que 100");
    
        }
    }
}
