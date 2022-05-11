package herança;

import javax.swing.JOptionPane;

public class VIP extends Ing{
	//quantidade de ingressos vips
	 int vip=0, total;
	 
	 void ingVip() {
	//soma o valor do vip + o valor do normal setado na classe Ingresso
		int vip =20 + getPrice();
		JOptionPane.showMessageDialog(null, "O valor do Ingress VIP é de: " + vip );
		vip = Integer.parseInt(JOptionPane.showInputDialog("Deseja Comprar o Ingresso VIP?\n(1)Sim, quero comprar\n(2)Não"));
	//soma a quantidade
		if (vip==1) {
			total++;
		}else {
			total =0;
		}
	 }
}
