package poo;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//attributes
		Pessoa person = new Pessoa ();
		//name
		person.setName(JOptionPane.showInputDialog("Informe seu nome"));
		//day
		person.setDay(Integer.parseInt(JOptionPane.showInputDialog("Informe o dia em que você nasceu:")));
		//month
		person.setMonth(Integer.parseInt(JOptionPane.showInputDialog("Informe o mês em que você nasceu:")));
		//year
		person.setYear(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano em que você nasceu:")));
		//height
		person.setHeight(Integer.parseInt(JOptionPane.showInputDialog("Informe sua altura")));
		//print
		person.all();
	}

}
