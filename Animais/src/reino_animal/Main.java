package reino_animal;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal c = new Cachorro();
		
		JOptionPane.showMessageDialog(null, c.getNameDog());
		JOptionPane.showMessageDialog(null, c.getDogAge());
		JOptionPane.showMessageDialog(null, c.getDogNoise());
		
		Animal c2 = new Cavalo();
		
		JOptionPane.showMessageDialog(null, c2.getNameHorse());
		JOptionPane.showMessageDialog(null, c2.getHorseAge());
		JOptionPane.showMessageDialog(null, c2.getHorseNoise());
		
		Animal c3 = new Preguiça();
		
		JOptionPane.showMessageDialog(null, c3.getPreguicaName());
		JOptionPane.showMessageDialog(null, c3.getPreguicaNoise());
		JOptionPane.showMessageDialog(null, c3.getPreguicaAge());






	}

}
