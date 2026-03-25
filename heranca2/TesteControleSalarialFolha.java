package heranca2;

public class TesteControleSalarialFolha {

	public static void main(String[] args) {
		
		ControleSalarialFolha controle = new ControleSalarialFolha();
		
		Funcionario f = new Funcionario();
		f.setSalario(2000);
		controle.setTotalSalarios(f);
		System.out.println("Total de salarios até agora: "+controle.getTotalSalarios());
		
		Gerente g = new Gerente();
		g.setSalario(17000);
		controle.setTotalSalarios(g);
		System.out.println("Total de salarios até agora: "+controle.getTotalSalarios());
	}	
}