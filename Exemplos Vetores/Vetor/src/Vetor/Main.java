package Vetor;

import javax.swing.JOptionPane;

public class Main {

	public static int [] teste (int tamanho) {
		int[] vector= new int [tamanho];
		
		for(int i=0;i<vector.length;i++) {
			if (i % 2 == 0) {
				vector[i]=0;
			}
			else {
				vector[i] = 1;
			}
		}
		for (int element : vector) {
			JOptionPane.showMessageDialog(null, element );
		}
		return vector;
	}
	public static void main(String[] args) {
		//variables
		teste(8);
	}
}
