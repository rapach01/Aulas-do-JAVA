package herança;

import javax.swing.JOptionPane;

public class Normal extends Ing{
	//quantidade de ingressos normais
	int normal=0;
	void ingNormal() {
		//printa o valor do ingresso normal
		JOptionPane.showMessageDialog(null,"O valor do Ingresso normal é: " + getPrice());
		normal = Integer.parseInt(JOptionPane.showInputDialog("Deseja Comprar o Ingresso normal?\n(1)Sim, quero comprar\n(2)Não"));
	}
}