package stringefor;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//variaveis
		String s ="";
		int i = 0;
		boolean verify = true;
		//laço for
		for(i=0;i<10;i++) {
			//recebe a palavra/numero
			s = JOptionPane.showInputDialog("Informe um número ou uma palavra");
			//variavel para o cast
			int n = 0;
			
			try {
				//tenta transformar em um int
				n = (Integer.parseInt(s));
				verify = true;
			} 
			//se nao, é palavra
			catch (NumberFormatException e) {
				verify = false;
			}
			//printa a verificação
			if(verify == true) {
				JOptionPane.showMessageDialog(null, "É número");
			}else { 
				JOptionPane.showMessageDialog(null, "É palavra");
			}
		}
	}
}


