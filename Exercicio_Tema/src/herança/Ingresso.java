package herança;

import javax.swing.JOptionPane;

public class Ingresso {
	//variavel do switch
	private int op=0;
	// chama as classes
	private Normal n = new Normal();
	private VIP v = new VIP();
	private CamaroteInferior ci = new CamaroteInferior();
	private CamaroteSuperior cs = new CamaroteSuperior();
	private Print p = new Print();
	
	//menu
	void choices() {
		op = Integer.parseInt(JOptionPane.showInputDialog("Qual Ingresso deseja comprar?\n(1)Ingresso normal\n(2)Ingresso VIP\n(3)CamaroteInferior\n(4)Camarote Superior\n(5)Total de Ingressos Comprados\n(6)Sair"));
	//chama as classes correspondentes e repete tudo
		switch(op) {
			case 1:{
				n.ingNormal();
				choices();
				break;
			}
			case 2:{
				v.ingVip();
				choices();
				break;
			}
			case 3:{
				ci.ingCI();
				choices();
				break;
			}
			case 4:{
				cs.ingCS();
				choices();
				break;
				}
			case 5:{
				p.print();
				choices();
				break;
			}
			default:{
				break;
			}
		}
	}
}
