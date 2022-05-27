package interfaces;

import javax.swing.JOptionPane;

public interface CaixaEletronico {
	
	void sacar(double valor);
		
	default void VerificaFraude() {
			JOptionPane.showMessageDialog(null, "Verificação de fraude iniciada!");
	}
}


