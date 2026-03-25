package aulaPoo2;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		
		f1.nome = "Danyel";
		f1.status = "Ativo";
		f1.salario = 10000.0;
		System.out.println("Salário atual: "+f1.salario);
		f1.bonificacao(1200);
		System.out.println("Salário atual com vale Páscoa: "+f1.salario);
		
	}
	
}
