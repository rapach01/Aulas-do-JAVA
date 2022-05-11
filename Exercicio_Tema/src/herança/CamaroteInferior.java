package herança;

import javax.swing.JOptionPane;

public class CamaroteInferior extends Ing{
	//quantidade de inferior
	int ci, total;
	void ingCI() {
	//soma o valor do inferior + o valor do normal setado na classe Ingresso
		int priceCI = 50 + getPrice();
	//printa o valor
		JOptionPane.showMessageDialog(null, "O valor do Camarote Superior é de: " + priceCI);
		ci = Integer.parseInt(JOptionPane.showInputDialog("Deseja Comprar o Ingresso Inferior?\n(1)Sim, quero comprar\n(2)Não"));
	//soma a quantidade
		if (ci==1) {
			total ++;
		}else {
			total = 0;
		}
	}
}
