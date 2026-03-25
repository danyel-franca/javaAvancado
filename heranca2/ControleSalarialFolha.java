package heranca2;

public class ControleSalarialFolha {

	private double totalSalarios = 0;
	
	public void setTotalSalarios(Funcionario f) { // Passou como parametro um objeto de Funcionario, para pegar o atributo salario
		this.totalSalarios += f.getSalario();
	}
	
	public double getTotalSalarios() {
		return this.totalSalarios;
	}
}
