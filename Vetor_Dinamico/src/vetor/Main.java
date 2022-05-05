package vetor;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	//variables
		int size=0, op=0;
	//array
		size = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor"));
	//array's variables
		String[] str = new String[size];
	//array
		for ( int i=0; i<str.length; i++ ) {
			str[i]=JOptionPane.showInputDialog("Informe um ou mais nomes");
		}
	//print
		for ( int i=0; i<str.length; i++) {
			JOptionPane.showMessageDialog(null,  str[i]);
		}
		op=Integer.parseInt(JOptionPane.showInputDialog("Deseja mudar o tamanho do vetor?\n[1]Sim\n[2]Não"));
	//conditions
		if (op == 1) {
	//variables of 2nd array
			int size2=0;
			size2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor"));
			String[] str2 = new String[size2];
	//size of 2nd array
			for ( int i=0; i<str2.length; i++ ) {
				str2[i]=JOptionPane.showInputDialog("Informe um ou mais nomes");
			}
	//print both array
			for ( int i=0; i<size; i++) {
				JOptionPane.showMessageDialog(null, "Itens do primeiro vetor: " +  str[i]);
			}
			for ( int i=0; i<size2; i++) {
				JOptionPane.showMessageDialog(null, "Itens do segundo vetor:  " +  str2[i]);
			}
	//exit
		}else {
			JOptionPane.showMessageDialog(null, "Programa Encerrado");
		}
	}
}
