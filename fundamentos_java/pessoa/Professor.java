package pessoa;

public class Professor extends Pessoa{
    private double salario;

    public double getSalario() {
        return this.salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }


    @Override
    public String toString() {
        System.out.println(super.toString());
        return "É um professor com salario: " + salario + "\n";
    }

    
}
