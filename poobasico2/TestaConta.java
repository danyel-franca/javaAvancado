package aulaPoo;

public class TestaConta {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		
		c1.agencia = 010;
		c1.numero = 001;
		c1.limite = 10000.0;
		c1.saldo = 2000.0;
		c1.nome = "Danyel";
		
		System.out.println("Número da conta: "+c1.numero);
		System.out.println("Titular: "+c1.nome);
		System.out.println("Saldo atual: "+c1.saldo);
		System.out.println("Limite da conta: "+c1.limite);
	}
	
}
