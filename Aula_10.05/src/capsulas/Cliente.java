package capsulas;

public class Cliente {
	
	private String name, cpf, adress;
	private int age;
	private double money;

	
	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	/*
	void addCpf (String cpf) {
		this.cpf=cpf;
	}

	void mudaCpf(String cpf) {
		validaCpf(cpf);
		this.cpf=cpf;
	}
	
	private void validaCpf(String cpf) {
		if (cpf == this.cpf ) {
			this.cpf = cpf;
		}else {
			System.out.print(false);
		}
	}*/
}
