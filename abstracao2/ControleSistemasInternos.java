package abstracao2;

public class ControleSistemasInternos {

	int senha;
	
	void validaSenha(AcessoInterno a) {
		a.verificaSenha(senha);
	}
	
}
