package exercicio;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro par�metro");
		int parametroUm = scan.nextInt();

		System.out.println("Digite o segundo par�metro");
		int parametroDois = scan.nextInt();

		try {
			if (parametroUm > parametroDois) {
				throw new ParametrosInvalidosException();
			}
			contar(parametroUm, parametroDois);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

		int contagem = parametroDois - parametroUm;

		for (int i = 0; i <= contagem; i++) {
			System.out.println("Imprimindo o n�mero " + i);
		}
	}
}