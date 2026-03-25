package construtores2;

public class TestaContaClienteConstrutor {

	public static void main(String[] args) {
		
		ContaClienteConstrutor cc = new ContaClienteConstrutor("Danyel", "2837283239");
//		cc.cliente.nome = "Danyel";
		System.out.println("O titular da conta cc: "+cc.cliente.nome);
		System.out.println("CPF: "+cc.cliente.cpf);
		
	}
	
}
