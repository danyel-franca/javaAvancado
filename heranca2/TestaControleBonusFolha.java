package heranca2;

public class TestaControleBonusFolha {

	public static void main(String[] args) {
		
		ControleBonusFolha controle = new ControleBonusFolha();
		
		Funcionario f = new Funcionario();
		f.setSalario(2000);
		controle.setTotalBonus(f);
		System.out.println("Total de bonus até agora: "+controle.getTotalBonus());
		
		
		Gerente g = new Gerente();
		g.setSalario(17000);
		controle.setTotalBonus(g);
		System.out.println("Total de bonus até agora: "+controle.getTotalBonus());
	}
}
