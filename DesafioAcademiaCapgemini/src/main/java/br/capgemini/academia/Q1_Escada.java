package br.capgemini.academia;

import java.util.Scanner;

/**Classe para objetos do tipo Q2_Senha, onde serão contidos, valores e métodos.
* @author Robson Coura
* 
*/

public class Q1_Escada {

	int n = 0;

	public static String retorna(int num) {
		boolean rep = true;

		Scanner entrada = new Scanner(System.in);
		while (rep == true) { 
			System.out.println("Digite a quantidade de degraus: ");

			String qtdDegraus = entrada.nextLine();
			entrada.close();
			int n = 0;

			try {
				n = Integer.parseInt(qtdDegraus); 
			} catch (NumberFormatException e) { 
				
				System.out.println("Entrada com valor inválido");
			}

			if (n > 0) {
				for (int i = 0; i <= n; i++) {
					for (int a = i; a < n; a++) {
						System.out.print(" ");
					}
					for (int esp = 0; esp < i; esp++) {

						System.out.print("*");
					}
					System.out.println("");
					rep = false;
				}

			} else {
				System.out.println("O valor tem que ser um numero inteiro maior do que 0");
			}
		}
		return null;

	}

	public static void main(String[] args) {

		retorna(2);

	}

}
