package interfaces;

import javax.swing.JOptionPane;

public interface CaixaEletronico {
	
	void sacar(double valor);
		
	default void VerificaFraude() {
			JOptionPane.showMessageDialog(null, "Verifica��o de fraude iniciada!");
	}
}


