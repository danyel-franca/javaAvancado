package aulaPoo2;

public class ContaCliente{

	int agencia;
	int numero;
	Cliente cliente = new Cliente(); // permite acessar os atributos da classe cliente
	double saldo;
	double limite;
	
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
