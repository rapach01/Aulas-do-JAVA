package capsulas;

public class Main {

	public static void main(String[] args) {
		Funcionário f = new Funcionário();
		Professor p = new Professor();
		
		f.setNome("Arthur");
		p.setNome("Arthur ");
		p.ensinarDisciplina("POO");
	}

}
