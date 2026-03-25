package construtores;

public class ContaClienteConstrutor{

	int agencia;
	int numero;
	ClienteConstrutor cliente = new ClienteConstrutor(); // permite acessar os atributos da classe cliente
	double saldo;
	double limite;
	
	ContaClienteConstrutor(){
		System.out.println("Teste da classe com construtor!");
	}
	
	boolean sacar(double valor){
		
		if ((this.limite + this.saldo) < valor){
			return false;
		}else {
			this.saldo -= valor;
			return true;
		}
	}
	
	void depositar(double valor) {
		
		saldo += valor;
	}
	
}
