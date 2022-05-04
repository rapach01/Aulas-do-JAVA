package medias;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//variables
		double average1, average2, average;
		//count and print 
		average1 = 8 + 9 + 7 /3;
		JOptionPane.showMessageDialog(null, average1);
		average2 = 4 + 5 + 6 /3;
		JOptionPane.showMessageDialog(null, average2);
		average= average1 + average2 / 2;
		JOptionPane.showMessageDialog(null, average);
	}
}
