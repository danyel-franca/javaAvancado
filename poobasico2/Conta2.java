package aulaPoo;

public class Conta2 {

	int agencia;
	int numero;
	String nome;
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
