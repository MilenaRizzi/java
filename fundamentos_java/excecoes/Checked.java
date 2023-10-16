package excecoes;

import pessoa.Pessoa;

public class Checked {
    // é preferível evitar a ocorrência de NullPointerException por meio de programação defensiva, em vez de apenas capturá-la. Certifique-se de que os objetos sejam inicializados corretamente e de que você esteja tratando os casos em que um objeto pode ser null de forma apropriada.

    //poderia capturar e tratar com try/catch
    public static void main(String[] args) {
        Pessoa p = null;
        p.getCpf();
    }
}
