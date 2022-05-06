package matriz;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Main {
	
	public static void students(){
		String[][] grade = new String [8][5];

		int i=0, j=0;
		double average=0;
		
		for( i=0; i<8; i++) {
			grade[i][0]=JOptionPane.showInputDialog("Informe o nome do aluno: ");
			for( j=1; j<4; j++) {
				grade[i][j]=JOptionPane.showInputDialog("Informe as notas do aluno: ");
				average=0;
				average += Double.parseDouble(grade[i][j]);
				grade[i][4] = String.valueOf(average/2);
			}
		}
		JOptionPane.showMessageDialog(null, Arrays.deepToString(grade));
	}
		
	public static void main(String[] args) {
	 students();

	}

}
