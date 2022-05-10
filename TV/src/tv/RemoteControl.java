package tv;

import javax.swing.JOptionPane;

public class RemoteControl {
	Television v = new Television();
	
	private int vol=0, channel=0, i=0;

	void Control() {
		i = Integer.parseInt(JOptionPane.showInputDialog("(1)Aumentar Volume\n(2)Abaixar Volume\n(3)Avançar Canal\n(4)Retroceder Canal\n(5)Escolha Canal\n(6)Canal e Volume Atual"));
		
		switch(i) {
			case 1:{
				up();
				Control();
				break;
			}
			case 2:{
				down();
				Control();
				break;
			}
			case 3:{
				ChannelUp();
				Control();
				break;
			}
			case 4:{
				ChannelDown();
				Control();
				break;
			}
			case 5:{
				ChannelChoice();
				Control();
			}
			case 6:{
				show();
				Control();
			}
			default:{
				break;
			}
		}
	}
	private void up() {
		v.setVol(vol++);
	}
	private void down() {
		v.setVol(vol--);
	}
	private void ChannelUp() {
		v.setChannel(channel++);
	}
	private void ChannelDown() {
		v.setChannel(channel--);
	}
	private void ChannelChoice() {
		
		channel = Integer.parseInt(JOptionPane.showInputDialog("Informe o Canal que você quer assistir"));
		v.setChannel(channel);
	}
	private void show() {
		JOptionPane.showMessageDialog(null, "Canal atual: " + v.getChannel());
		JOptionPane.showMessageDialog(null, "Volume atual: " + v.getVol());
	}
}
