package polimorfismo;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario f = new Tecnico();
		
		f.setName("Nickerson\n");
		f.setSalary(1000);
		f.exibeDados();
		JOptionPane.showMessageDialog(null, f.ganhoAnual());
		
		Funcionario f2 = new Funcionario();
		f2.setName("Arthur\n");
		f2.setSalary(1000);
		f2.exibeDados();
		JOptionPane.showMessageDialog(null, f2.ganhoAnual());
	}

}
