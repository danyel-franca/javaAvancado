package aulaPoo;

public class TestaConta2 {

	public static void main(String[] args) {
		
		Conta2 c2 = new Conta2();
		
		c2.agencia = 010;
		c2.numero = 001;
		c2.limite = 10000.0;
		c2.saldo = 2000.0;
		c2.nome = "Danyel";
		
		System.out.println("Número da conta: "+c2.numero);
		System.out.println("Titular: "+c2.nome);
		System.out.println("Saldo atual: "+c2.saldo);
		System.out.println("Limite da conta: "+c2.limite);
		
		c2.sacar(20);
		System.out.println("Saldo atual: "+c2.saldo);
		
		c2.depositar(100);
		System.out.println("Saldo atual: "+c2.saldo);
		
		double valorSaque = 800;
		boolean resultado = c2.sacar(valorSaque);
		if (resultado) {
			System.out.println("Seu saque é de "+valorSaque+" e seu saldo atual é de "+c2.saldo);
		} else
			System.out.println("Valor acima do possivel, saque não efetuado!!");
		System.out.println("Saldo atual: "+c2.saldo);
	}
	
}
