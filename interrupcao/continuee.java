package interrupcao;

public class continuee {

	public static void main(String[] args) {
		
		String nome[] = {"Danyel", "eu", "vasco", "sla", "isso", "Danyel", "ta"};
		int contador = 0;
		
		for (int i = 0; i < nome.length; i++) {
			if (!nome[i].equals("Danyel")) {
				continue; // Interrompe o fluxo e continua para a próxima iteração do for
			}
			contador++;
		}
		
		System.out.println("Foram encontrados"+contador+" Lucas na lista");
	}
	
}
