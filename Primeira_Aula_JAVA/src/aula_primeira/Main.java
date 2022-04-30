package aula_primeira;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//scanner
		Scanner sc = new Scanner(System.in);
		
		//scan user's info
		System.out.println("Informe seu nome");
		String name = sc.next();
		System.out.println("Informe seu cpf");
		String cpf = sc.next();
		System.out.println("Informe seu telefone");
		String tel = sc.next();
		System.out.println("Informe seu endereço");
		String adress = sc.next();
		System.out.println("Informe sua idade");
		String age = sc.next();
		
		//print user's info
		System.out.println("Nome: " + name);
		System.out.println("CPF: " + cpf);
		System.out.println("Telefone: " + tel);
		System.out.println("Endereço: " + adress);
		System.out.println("Idade: " + age);
		


	}
}
