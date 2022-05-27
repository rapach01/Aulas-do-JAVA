package interfaces;

import javax.swing.JOptionPane;

public abstract class Caixa implements CaixaEletronico {
	
	public void sacar(double valor) {
		JOptionPane.showMessageDialog(null, "Vou sacar " + valor);
	}
}
