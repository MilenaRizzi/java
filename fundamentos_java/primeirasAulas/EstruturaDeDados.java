package primeirasAulas;
import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    public static void main(String[] args) {
        //Lista
        List<String> nomes = new ArrayList<>();
        nomes.add("Milena");
        nomes.add("Diego");
        nomes.add("Joaquim");

        // for(String nome : nomes) {
        //     System.out.println("Nome: " + nome);
        // }

        //utilizando lambda
        nomes.forEach(nome -> System.out.println("Nome: " + nome));

        //utilizando método de referencia
        //apenas vai printar os elementos que estão dentro do meu array
        nomes.forEach(System.out::println);
    }
}
