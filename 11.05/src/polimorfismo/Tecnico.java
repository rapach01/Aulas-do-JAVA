package polimorfismo;

public class Tecnico extends Funcionario{
	
	private double bonus=100;
	
	double ganhoAnual() {
		double ganho = (getSalary() + bonus) *12;
		return ganho;
	}
}
