package aulaPoo;

public class TestaConta4 {

	public static void main(String[] args) {
		
		Conta c1;
		c1 = new Conta();
		c1.limite = 100;
		System.out.println("Saldo de c1: "+c1.saldo);
		
		Conta c2;
		c2 = c1;
//		c2 = new Conta();
		c2.limite = 200;
		System.out.println("Saldo de c1: "+c1.saldo);
		System.out.println("Saldo de c2: "+c2.saldo);
		
		
	}
	
}
