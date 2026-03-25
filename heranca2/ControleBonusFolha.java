package heranca2;

public class ControleBonusFolha {
	
	private double totalBonus = 0;
	
	public void setTotalBonus(Funcionario f) {
		this.totalBonus += f.getBonus();
	}
	
	public double getTotalBonus() {
		return this.totalBonus;
	}
	
}
