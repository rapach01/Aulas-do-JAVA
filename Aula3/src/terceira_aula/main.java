package terceira_aula;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		//variaveis e inicializaçao  
		String s = "Arthur de Lima";
		
		//programa
		/*JOptionPane.showMessageDialog(null, "Igual: " + s.equals("Arthur de Lima"));
		JOptionPane.showMessageDialog(null, "Tamanho: " + s.length());
		JOptionPane.showMessageDialog(null, "Caracter da posição 5 de s: " + s.charAt(5));*/
	
		int a = 5;
		boolean b = (a == 10);
		System.out.println(!b);
		int c = 10 % 3;
		System.out.println(c);
		double d = 15.3;
		d += 10;
		System.out.println(d);
		boolean e = (d > 100 && d <=500);
		System.out.println(e);
	}

}
