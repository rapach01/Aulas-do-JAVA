package aula2;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
	
	int age;
	
	JOptionPane.showInternalMessageDialog(null,"Bem Vindo ao Calculo IMC");
	age = JOptionPane.showMessageDialog(null, "Informe sua Idade: ");
	
	if(age<18) {
		JOptionPane.showInternalMessageDialog(null, "Você ainda é menor de idade");
	}
	else if(age>=18 && age<=35) {
		JOptionPane.showInternalMessageDialog(null, "Parabens voce eh maior de idade");
	}
	else{
		JOptionPane.showInternalMessageDialog(null, "Voce ja esta velhinho");
	}
	}
}
