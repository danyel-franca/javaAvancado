package aulaPoo;

public class TestaConta5 {

	public static void main(String[] args) {
		
		Conta c1;
		c1 = new Conta();
		c1.nome = "Danyel";
		
		Conta c2;
		c2 = new Conta();
		c2.nome = "Danyel";

		if (c1 == c2) {
			System.out.println("As contas são iguais!");
		} else {
			System.out.println("As contas não são iguais");
		}
		
	}
	
}
