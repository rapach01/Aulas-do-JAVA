package herança;

import javax.swing.JOptionPane;

public class CamaroteSuperior extends Ing {
	//quantidade de ingressos superiores
	int cs, total;
	void ingCS() {
	//soma o valor da superior + o valor do normal setado na classe Ingresso
		int priceCS = 80 + getPrice();
		JOptionPane.showMessageDialog(null, "O valor do Camarote Superior é de: " + priceCS);
		cs = Integer.parseInt(JOptionPane.showInputDialog("Deseja Comprar o Ingresso Superior?\n(1)Sim, quero comprar\n(2)Não"));
	//soma a quantidade
		if (cs==1) {
			total ++;
		}else {
			total = 0;
		}
	}
}
