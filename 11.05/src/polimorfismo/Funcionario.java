package polimorfismo;

import javax.swing.JOptionPane;

public class Funcionario {
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	private double salary;
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	double ganhoAnual() {
		double ganho = this.salary *12;
		return ganho;
	}
	

	void exibeDados() {
		JOptionPane.showMessageDialog(null, "Nome: " + name + "Tem salário: " + salary);
	}
}
