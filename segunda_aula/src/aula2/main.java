package aula2;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// first contact with JOPTIONPANE
		
		String name, city, adress; 
		int cep=0, tel=0;
		
		JOptionPane.showMessageDialog(null, "Bem Vindo a nossa Agenda do Senac");
		name = JOptionPane.showInputDialog("Informe seu nome:\n");
		tel = Integer.parseInt(JOptionPane.showInputDialog("Informe seu telefone:\n"));
		adress = JOptionPane.showInputDialog("Informe seu endereço:\n");
		city = JOptionPane.showInputDialog("Informe sua cidade:\n");
		cep = Integer.parseInt (JOptionPane.showInputDialog("Informe seu CEP:\n"));
		
		JOptionPane.showMessageDialog(null, "Os dados que inseriu foram:\nNome: " + name + "Telefone: " + tel);
		JOptionPane.showMessageDialog(null, "\nEndereço: " + adress + "\nCidade: " + city + "\nCEP: " + cep);
	}

}
