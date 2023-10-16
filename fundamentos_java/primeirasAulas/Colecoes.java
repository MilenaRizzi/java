package primeirasAulas;
import java.util.HashMap;
import java.util.Map;

public class Colecoes {
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Milena", 10);
        notas.put("Diego", 10);

        // map trabalha com chave única
        //o valor que prevalecerá para a chave joaquim será o de 4.
        notas.put("Joaquim", 8);
        notas.put("Joaquim", 4);

        // for com HashMap
        for (Map.Entry<String, Integer> entry : notas.entrySet()) {
            String key = entry.getKey();
            Integer valor = entry.getValue();
            System.out.println("A chave é: " + key + " e o valor é: " + valor);
        }
    }
}
