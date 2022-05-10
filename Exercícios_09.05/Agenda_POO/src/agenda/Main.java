package agenda;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Agenda a = new Agenda();
		int op=0;
		
		op = Integer.parseInt(JOptionPane.showInputDialog("(1)Adicionar pessoa\n(2)Printar Agenda\n(3)Buscar Pessoa Registrada"));
		
		switch(op) {
			case 1:{
				a.savePerson();
			}
			case 2:{
				a.printSchedule();
				break;
			}
			case 3:{
				a.searchPerson();
				break;
			}
		}
	}

}
