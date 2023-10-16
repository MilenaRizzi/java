package primeirasAulas;
import java.util.HashSet;
import java.util.Set;

public class ColecaoHashSet {
    public static void main(String[] args) {

        //hash set não mantêm uma ordem dos elementos 
        //guarda elementos únicos
        Set<Integer> numeros = new HashSet<>();
        numeros.add(10);
        numeros.add(11);
        numeros.add(12);
        numeros.add(13);

        numeros.remove(13);

        System.out.println("Tamanho: " + numeros.size());

        for (Integer elemento : numeros) {
            System.out.println(elemento);
        }

        //verificar se um número existe
        System.out.println(numeros.contains(12));
    }
}
