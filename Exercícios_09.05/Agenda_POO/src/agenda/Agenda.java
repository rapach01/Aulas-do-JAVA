package agenda;

import javax.swing.JOptionPane;

public class Agenda {
	//attributes
	private int n=0, i=0;
	private String[] name = new String [n];
	private int[] age = new int [n];
	private double[] height = new double [n];
	private String search="", c="";
	
	//switch method
	void choices() {
		int op=0;
		
		op = Integer.parseInt(JOptionPane.showInputDialog("(1)Adicionar pessoa\n(2)Printar Agenda\n(3)Buscar Pessoa Registrada\n(4)Deletar Alguém"));
		
		switch(op) {
			case 1:{
				savePerson();
				choices();
			}
			case 2:{
				printSchedule();
				choices();
				break;
			}
			case 3:{
				searchPerson();
				choices();
				break;
			}
			case 4:{
				deletePerson();
				choices();
				break;
			}
		}
	}
	//add person
	void savePerson() {
		
		//number of people
		n = Integer.parseInt(JOptionPane.showInputDialog("Informe quantas pessoas você deseja adicionar"));
		
		//variables
		String name[] = new String[n];
		int age[] = new int [n];
		double height[] = new double [n];
		//condition 
		if(n>10) {
			JOptionPane.showMessageDialog(null, "O máximo de pessoas que pode adicionar é 10");
			n=Integer.parseInt(JOptionPane.showInputDialog("Informe quantas pessoas você deseja adicionar"));
		}
		
		//array loop
		for(i=0;i<n;i++) {
			name[i] = JOptionPane.showInputDialog("Informe o nome da pessoa: ");
			age[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade"));
			height[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura"));
		}
		this.name=name;
		this.age=age;
		this.height=height;
	}
	void printSchedule() {
		StringBuilder sb = new StringBuilder (10);
		for(i=0;i<n;i++){
			sb.append("[ Nome: "+name[i]+"] " + "[ Idade: "+age[i]+"] " + "[ Altura: "+height[i]+"]\n" );
		}
		//print
		JOptionPane.showMessageDialog(null, sb.toString());
	}
	//search person
	void searchPerson() {
		search = JOptionPane.showInputDialog("Informe o nome de quem você está procurando: ");
		
		for(i=0;i<n;i++) {
			if (name[i].equals(search)) {
				JOptionPane.showMessageDialog(null, name[i]);
			}
			else {
				JOptionPane.showMessageDialog(null, "Este nome não está registrado");
			}
		}
	}
	//delete person
	void deletePerson() {
		c = JOptionPane.showInputDialog("Informe o nome de quem você quer deletar: ");
		
		for(i=0;i<n;i++) {
			if (name[i].equals(c)) {
				name[i] = " ";
				age[i] = 0;
				height[i] = 0;
			}
		}
	}
}

