package poo;

import javax.swing.JOptionPane;

public class Pessoa {
	//private attributes
	private String name="";
	private int day=0,month=0, year=0, age=0;
	private double height;
	
	//name class
	String setName(String name) {
		this.name=name;
		return name;
	}
	//day class
	void setDay(int day) {
		this.day=day;
	}
	//month class
	void setMonth(int month) {
		this.month=month;
	}
	//year class
	void setYear(int year) {
		this.year=year;
	}
	//height class
	double setHeight(double height) {
		this.height=height;
		return height;
	}
	//age class
	public int setAge(int age) {
		age= 2022 - year; 
		this.age=age;
		return age;
	}
	//print everything
	void all() {
		JOptionPane.showMessageDialog(null, setName(name) + "\n" + setAge(age) + "\n" + setHeight(height));
	}
}
