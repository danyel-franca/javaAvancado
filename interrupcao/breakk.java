package interrupcao;

public class breakk {

	public static void main(String[] args) {
		
		int[][] numeros = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		int numeroPesquisa = 5;
		boolean numeroEncontrado = false;
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				if (numeroPesquisa == numeros[i][j]) {
					numeroEncontrado = true;
					break;
				}
			}
			
		}
		
		if (numeroEncontrado) {
			System.out.println("Encontrado");
		}
		
	}
	
}
