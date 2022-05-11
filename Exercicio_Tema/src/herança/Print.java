package herança;

import javax.swing.JOptionPane;

public class Print extends Ing {
	//chama as classes
	private Normal n = new Normal();
	private VIP v = new VIP();
	private CamaroteInferior ci = new CamaroteInferior();
	private CamaroteSuperior cs = new CamaroteSuperior();

	void print() {
		//printa a quantidade de ingressos
		JOptionPane.showMessageDialog(null, "Total de Ingressos Comprados:\n" + getNormal() + "\n" + v.vip + "\n" + ci.ci + "\n" + cs.cs);
	}
}
