package pessoa;

public class Aluno extends Pessoa{
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    @Override
    public String toString() {
        System.out.println(super.toString());
        return "É um aluno de matricula: " + matricula + "\n";
    }

}
