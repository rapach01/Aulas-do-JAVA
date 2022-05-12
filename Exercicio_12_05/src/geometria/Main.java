package geometria;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int op=0;
		double lado1, lado2, lado3, lado4;
		Formas f = new Quadrilatero() {};
		
		op = Integer.parseInt(JOptionPane.showInputDialog("(1)Calcular Perímetro de um Quadrilátero\n(2)Calcular Perímetro de um Quadrado\n(3)Calcular Perímetro de um Retângulo\n(4)Caclular o diâmetro de um círculo"));
		
			switch(op) {
				case 1:{
					lado1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o tamanho do lado 1"));
					lado2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o tamanho do lado 2"));
					lado3 = Double.parseDouble(JOptionPane.showInputDialog("Informe o tamanho do lado 3"));
					lado4 = Double.parseDouble(JOptionPane.showInputDialog("Informe o tamanho do lado 4"));
					f.perimeter(lado1, lado2, lado3, lado4);
				}
				case 2:{
					lado1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o tamanho de um lado do quadrado: "));
					f.periquad(lado1);
				}
				case 3:{
					lado1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o tamanho de um lado do retangulo: "));
					lado2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o tamanho o outro lado do retangulo: "));
					f.periret(lado1, lado2);
				}
				case 4: {
					lado1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o tamanho do raio do circulo: "));
					f.perimetrocirc(lado1);
				}
			}

	}

}
