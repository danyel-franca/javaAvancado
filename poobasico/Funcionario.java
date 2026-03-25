package aulaPoo2;

public class Funcionario {

	String nome;
	String cpf;
	String departamento;
	String dataAdmissao;
	double salario;
	String status;
	
	void bonificacao(double bonus) {
		this.salario += bonus;
	}
	
}
