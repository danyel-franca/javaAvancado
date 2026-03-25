package aulaPoo2;

public class TestaContaCliente {

	public static void main(String[] args) {
		
		ContaCliente cc1 = new ContaCliente();
		cc1.cliente.nome = "Danyel";
		System.out.println("O titular da conta cc1: "+cc1.cliente.nome);
		
	}
	
}
