package abstracao2;

public class Atendente extends Funcionario implements AcessoInterno{
	int senha;
	
	@Override
	public boolean verificaSenha(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso autorizado!");
			return true;
		} else {
			System.out.println("Acesso NÃO autorizado!");
			return false;
		}
		// entra no sistema de atendentes somente para consulta dos dados dos clientes
	}
	
	public void atenderCliente() {
		//TODO
	}

	@Override
	public double getBonus() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
