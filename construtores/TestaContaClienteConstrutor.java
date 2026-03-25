package construtores;

public class TestaContaClienteConstrutor {

	public static void main(String[] args) {
		
		ContaClienteConstrutor cc = new ContaClienteConstrutor();
		cc.cliente.nome = "Danyel";
		System.out.println("O titular da conta cc1: "+cc.cliente.nome);
		
	}
	
}
