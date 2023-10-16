package pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setCpf("33332221115");
        professor.setNome("Daniele");
        professor.setIdade(33);
        professor.setSalario(50000);
        System.out.println(professor.getNome());
        System.out.println(professor.toString());

        Aluno aluno = new Aluno();
        aluno.setCpf("1234568779");
        aluno.setIdade(19);
        aluno.setNome("Fernanda");
        aluno.setMatricula("898989");
        System.out.println(aluno.toString());
    }
    
}
