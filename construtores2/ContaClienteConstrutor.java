package construtores2;

public class ContaClienteConstrutor{

	int agencia;
	int numero;
	ClienteConstrutor cliente = new ClienteConstrutor(); // permite acessar os atributos da classe cliente
	double saldo;
	double limite;
	
	ContaClienteConstrutor(String nome, String cpf){
		System.out.println("Teste da classe com construtor!");
		this.cliente.nome = nome;
		this.cliente.cpf = cpf;
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
