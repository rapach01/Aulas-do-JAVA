package agenda;

import javax.swing.JOptionPane;

public class Agenda {
	int n=0, i=0;
	private String[] name = new String [n];
	private int[] age = new int [n];
	private double[] height = new double [n];
	private String[] search = new String[n];
	
	void savePerson() {
		String name[] = new String[n];
		int age[] = new int [n];
		double height[] = new double [n];
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Informe quantas pessoas você deseja adicionar"));
		if(n>10) {
			JOptionPane.showMessageDialog(null, "O máximo de pessoas que pode adicionar é 10");
			n=Integer.parseInt(JOptionPane.showInputDialog("Informe quantas pessoas você deseja adicionar"));
		}else {
			
		for(i=0;i<n;i++) {
			name[i] = JOptionPane.showInputDialog("Informe o nome da pessoa: ");
			age[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade"));
			height[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura"));
		}
		}
		this.name=name;
		this.age=age;
		this.height=height;
	}
	void printSchedule() {
		StringBuilder sb = new StringBuilder (10);
		for(i=0;i<n;i++){
			sb.append("["+name[i]+"]"+"["+age[i]+"]"+height[i]+"]\n" );
		}
		JOptionPane.showMessageDialog(null, sb.toString());
	}
	
	void searchPerson() {
		search[n] = JOptionPane.showInputDialog("Informe o nome de quem você está procurando: ");
		
		for(i=0;i<n;i++) {
			if (search[i].equals (name[i])) {
				JOptionPane.showMessageDialog(null, name[i]);
			}
			else {
				JOptionPane.showMessageDialog(null, "Este nome não está registrado");
			}
		}
	}
	
}

