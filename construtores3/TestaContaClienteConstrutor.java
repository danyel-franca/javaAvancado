package construtores3;

public class TestaContaClienteConstrutor {

	public static void main(String[] args) {
		
		// Primeiro objeto
		ContaClienteConstrutor cc = new ContaClienteConstrutor("Danyel", "2837283239");
		System.out.println("O titular da conta cc: "+cc.cliente.nome);
		System.out.println("CPF: "+cc.cliente.cpf);
		int contador = ContaClienteConstrutor.getContadorContas();
		System.out.println("Quantidade de clientes registrados: "+contador);
		
		System.out.println("=================================");
		
		// Segundo objeto
		ContaClienteConstrutor cc1 = new ContaClienteConstrutor("Emanuel", "382362836");
		System.out.println("O titular da conta cc: "+cc1.cliente.nome);
		System.out.println("CPF: "+cc1.cliente.cpf);
		contador = ContaClienteConstrutor.getContadorContas();
		System.out.println("Quantidade de clientes registrados: "+contador);
		
	}
	
}
