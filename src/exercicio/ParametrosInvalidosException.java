package exercicio;

public class ParametrosInvalidosException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public String getMessage() {
		return "O segundo par�metro deve ser maior que o primeiro";
	}
}
