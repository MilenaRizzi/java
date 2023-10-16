package excecoes;

import pessoa.Pessoa;

public class Checked {
    // é preferível evitar a ocorrência de NullPointerException por meio de programação defensiva, em vez de apenas capturá-la. Certifique-se de que os objetos sejam inicializados corretamente e de que você esteja tratando os casos em que um objeto pode ser null de forma apropriada.
    public static void main(String[] args) {
        try {
            Pessoa p = null;
            p.getCpf();
        } catch (NullPointerException e) {
            System.out.println("Erro  --> " + e);
        }
    }
}
