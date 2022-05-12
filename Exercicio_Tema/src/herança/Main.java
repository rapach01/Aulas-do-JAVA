package herança;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	//declara a classe principal
		int op=0, c=0;
		Ing i = new Ing();
		Normal n = new Normal();
		VIP v = new VIP();
		CamaroteInferior ci = new CamaroteInferior();
		CamaroteSuperior cs = new CamaroteSuperior();

		//chama a classe principal
		while (c != 6) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Qual Ingresso deseja comprar?\n(1)Ingresso normal\n(2)Ingresso VIP\n(3)CamaroteInferior\n(4)Camarote Superior\n(5)Ver Total\n(6)Sair"));
		//chama as classes correspondentes e repete tudo
				switch(op) {
					case 1:{
						n.ingNormal();	
						break;
					}
					case 2:{
						v.ingVip();
						break;
					}
					case 3:{
						ci.ingCI();
						break;
					}
					case 4:{
						cs.ingCS();
						break;
						}
					case 5:{
						JOptionPane.showMessageDialog(null, "Ingressos Normais: " + n.total + "\nIngressos VIPs: " + v.total +"\nIngressos Inferiores: " + ci.total + "\nIngressos Superiores: " + cs.total );
					}
					default:{
						c=6;
						break;
					}
				}
			}
		}
	}


