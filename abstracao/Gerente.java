package abstracao;

public class Gerente extends Funcionario{

	private int senha;
	
	public boolean verificaSenha(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso autorizado!");
			return true;
		} else {
			System.out.println("Acesso NÃO autorizado!");
			return false;
		}
		// entra no sistema de gerentes para verificação dos dados do cliente e contas
		// inclusive com permissões e verificação, exclusão e alteração de dados críticos
	}
	
	@Override
	public double getBonus() {
		return this.salario * 0.17;
	}
}
