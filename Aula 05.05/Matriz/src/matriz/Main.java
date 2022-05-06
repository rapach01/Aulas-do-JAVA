package matriz;

import javax.swing.JOptionPane;

public class Main {

	public static int[][] TesteMatriz(int l, int c){
		int[][] matriz = new int [l][c];
		int i=0, j=0;
		
		for ( i=0; i<l; i++) {
			for (j=0; j<c; j++) {
				if (i % 2 == 0) {
					matriz[i][j] = 0;
				}else {
					matriz[i][j] = 1;
				}
			}
		}
		for (int[] linha: matriz) {
			System.out.print("\n");
			for(int elemento: linha) {
				System.out.print(" " + elemento);
			}
		}
		return matriz;
	}
	
	public static void main(String[] args) {
		//variables
		TesteMatriz(2, 4);
	
	}

}
