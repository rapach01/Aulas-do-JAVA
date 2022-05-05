package Agenda;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//variables
		int i, op;
		String name = "", adress = "", Cep = "", tel = "";
		
		//loop
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("Informe como deseja continuar:\n[1]Adicionar Contato\n[2]Listar\n[3]Modificar Algum\n[4]Para Sair;"));
			//menu choices
			switch(op) {
				case 1:{
					//add contact
					name=JOptionPane.showInputDialog("Informe seu nome: ");
					adress=JOptionPane.showInputDialog("Informe seu endereço: ");
					Cep=JOptionPane.showInputDialog("Informe seu CEP: ");
					tel=JOptionPane.showInputDialog("Informe seu telefone: ");
					break;
				}
				//list
				case 2:{
					JOptionPane.showMessageDialog(null, name + "\n" + adress + "\n" + Cep + "\n" + tel);
					break;
				}
				//change contact
				case 3:{
					do {
						i = Integer.parseInt(JOptionPane.showInputDialog("Informe qual deseja modificar:\n[1]Nome\n[2]Endereço\n[3]CEP\n[4]Telefone\n[5]Sair"));
						switch(i) {
							case 1:{
								name=JOptionPane.showInputDialog("Informe seu nome: ");
								break;
							}
							case 2: {
								adress=JOptionPane.showInputDialog("Informe seu endereço: ");
								break;
							}
							case 3: {
								Cep=JOptionPane.showInputDialog("Informe seu CEP: ");
								break;
							}
							case 4: {
								tel=JOptionPane.showInputDialog("Informe seu Telefone: ");
							}
							default:{
								i=5;
								break;
							}
						}
					}while (i!=5);
					break;
				}
				//exit
				default: {
					op=4;
					break;
				}
			}
		}while(op!=4);

	}

}
