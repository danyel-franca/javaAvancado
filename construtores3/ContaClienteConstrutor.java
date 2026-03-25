package construtores3;

public class ContaClienteConstrutor{
	
	private static int contadorContas; // Atributo de classe
	int agencia; // Atributo de objeto, como se fosse um contador global
	int numero;
	ClienteConstrutor cliente = new ClienteConstrutor(); // permite acessar os atributos da classe cliente
	double saldo;
	double limite;
	
	ContaClienteConstrutor(String nome, String cpf){
		System.out.println("Teste da classe com construtor!");
		this.cliente.nome = nome;
		this.cliente.cpf = cpf;
		ContaClienteConstrutor.contadorContas++;
	}
	
	public static int getContadorContas() { // Visualizar o contador, o static faz ser um atributo somente da classe, para usar ele chama por ela
		return ContaClienteConstrutor.contadorContas;
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
