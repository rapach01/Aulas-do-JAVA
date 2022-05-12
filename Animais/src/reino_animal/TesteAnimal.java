package reino_animal;

import javax.swing.JOptionPane;

public class TesteAnimal extends Animal{
	int op, i;;
	String[] Animals = new String[10];
	
	void teste() {
		for( i=0; i<10; i++) {
			op= Integer.parseInt(JOptionPane.showInputDialog(null, "Qual você deseja ouvir primeiro?\n(1)Cachorro\n(2)Cavalo\n(3)Preguiça"));
			
			if(op==1) {
				Animals[i] = getDogNoise();
			}else if (op==2) {
				Animals[i] = getHorseNoise();
			}else if (op==3) {
				Animals[i] = getPreguicaNoise();
			}
		}
		for( i=0; i<10; i++) {
			JOptionPane.showMessageDialog(null, Animals[i]);
		}
	}
		
	
}
