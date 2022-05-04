import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//variables
		int op = 0, i = 0;
		String name="", adress="", CEP="", tel="";
		
		//loop of main menu
		do {
			//main menu
			op = Integer.parseInt(JOptionPane.showInputDialog("Informe qual opção você deseja:\n[1]Adiocionar Contato\n[2]Lista\n[3]Modificar algo\n[4]Sair"));
			
			//choices
			switch (op) {
				case 1:{
					//register
						name = JOptionPane.showInputDialog("Informe seu nome: ");
						adress = JOptionPane.showInputDialog("Informe seu Endereço: ");
						CEP = JOptionPane.showInputDialog("Informe seu CEP: ");
						tel = JOptionPane.showInputDialog("Informe seu Telefone: ");
					break;
					}
				case 2:{
					//print
					JOptionPane.showMessageDialog(null, name + "\n" + adress + "\n" + CEP + "\n" + tel);
					break;
				}
				case 3:{
					//loop of secondary menu
					do {
						i = Integer.parseInt(JOptionPane.showInputDialog("Informe qual você deseja modificar:\n[1]Nome\n[2]Endereço\n[3]CEP\n[4]Telefone\n[5]Sair"));
						switch(i) {
					 		case 1:{
					 			name = JOptionPane.showInputDialog("Informe seu nome: ");
					 			break;
					 		}
					 		case 2:{
					 			adress = JOptionPane.showInputDialog("Informe seu endereço: ");
					 			break;
					 		}
					 		case 3:{
					 			CEP = JOptionPane.showInputDialog("Informe seu CEP: ");
					 			break;
					 		}
					 		case 4:{
					 			tel = JOptionPane.showInputDialog("Informe seu telefone: ");
					 			break;
					 		}
					 		default:{
					 			break;
					 		}
						}
					}while(i != 5);
					break;
				}
				//exit
				default:{
					break;
				}
			}
			//condition to exit
		}while(op != 4);
	}

}
