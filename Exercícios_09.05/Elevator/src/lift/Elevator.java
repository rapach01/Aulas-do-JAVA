package lift;

import javax.swing.JOptionPane;

public class Elevator {
	//attributes
	private int people=0;
	private int floor=0;
	private int op=0, i=0;
	
	//switch method
	void start() {
		op = Integer.parseInt(JOptionPane.showInputDialog("(1)Entrar no Elevador\n(2)Subir\n(3)Descer\n(4)Sair"));
		switch(op) {
			case 1:{
				in();
				start();
				break;
			}
			case 2:{
				if(floor == 8) {
					JOptionPane.showMessageDialog(null, "Você está no último andar");
				}else {
					up();
				}
				start();
				break;
			}
			case 3:{
				if(floor == 1) {
					JOptionPane.showMessageDialog(null, "Você está no primeiro andar");
				}else {
					down();
				}
				start();
				break;
			}
			case 4:{
				exit();
				start();
				break;
			}
		}
	}
	//enter method
	private void in() {
		i = Integer.parseInt(JOptionPane.showInputDialog("Deseja entrar no elevador?\n(1)Sim\n(2)Não"));
		
		if(i==1 && people == 4 ) {
			JOptionPane.showMessageDialog(null, "lotação máxima");
		}else if (i == 1 && people < 4) {
			people ++;
		}
		
	}
	//exit method
	private void exit() {

		i = Integer.parseInt(JOptionPane.showInputDialog("Deseja sair do elevador?\n(1)Sim\n(2)Não"));
		
		if(i==1) {
			people -= 1;
		}else {
			people = 0;
		}
	}
	
	//up method
	private void up() {
		i = Integer.parseInt(JOptionPane.showInputDialog("Deseja subir quantos andares?\nLimite:8"));
		switch(i) {
			case 1:{
				floor ++;
				break;
			}
			case 2:{
				floor += 2;
				break;
			}
			case 3:{
				floor += 3;
				break;
			}
			case 4:{
				floor += 4;
				break;
			}
			case 5:{
				floor += 5;
				break;
			}
			case 6:{
				floor += 6;
				break;
			}
			case 7:{
				floor += 7;
				break;
			}
			case 8:{
				floor += 8;
				break;
			}
			default:{
				JOptionPane.showMessageDialog(null, "Este andar não existe");
				break;
			}
		}
	}
	
	//down method
	private void down() {
		i = Integer.parseInt(JOptionPane.showInputDialog("Deseja subir quantos andares?\nLimite:8"));
		switch(i) {
			case 1:{
				floor --;
				break;
			}
			case 2:{
				floor -= 2;
				break;
			}
			case 3:{
				floor -= 3;
				break;
			}
			case 4:{
				floor -= 4;
				break;
			}
			case 5:{
				floor -= 5;
				break;
			}
			case 6:{
				floor -= 6;
				break;
			}
			case 7:{
				floor -= 7;
				break;
			}
			case 8:{
				floor -= 8;
				break;
			}
			default:{
				break;
			}
		}
		
		if(floor == 1) {
			JOptionPane.showMessageDialog(null, "Você está no primeiro andar andar");
		}
	}
}
