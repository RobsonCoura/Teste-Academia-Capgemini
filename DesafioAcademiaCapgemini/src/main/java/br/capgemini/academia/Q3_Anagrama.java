package br.capgemini.academia;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Classe para objetos do tipo Q3_Anagrama, onde ser�o contidos, valores e
 * m�todos.
 * 
 * @author Robson Coura
 *
 */

public class Q3_Anagrama {

	public static void main(String[] args) {

		String palavra;

		Scanner entrada = new Scanner(System.in);

		// L�gica
		System.out.println("Digite uma palavra : ");
		palavra = entrada.nextLine();

		// anagrama(palavra);
		System.out.println(anagrama(palavra));
		entrada.close();
	}

	/**
	 * anagrama - esse m�todo faz uma verifica��o das possibilidades em formar,
	 * pares de palavras substrings que s�o anagramas.
	 * 
	 * Recebe uma palavra "String" e verifica quantos pares de substrings s�o
	 * anagramas.
	 * 
	 * @param palavra - Que ser� verificada a quantidade de anagramas em suas
	 *                substrings
	 * @return retorna um dado do tipo inteiro com a quantidade de pares de
	 *         substring que s�o anagramas.
	 */
	static int anagrama(String palavra) {

		HashMap<String, Integer> mapa = new HashMap<String, Integer>();

		// L�gica do algoritmo
		for (int i = 0; i <= palavra.length(); i++) {

			for (int j = i; j < palavra.length(); j++) {

				char[] caracter = palavra.substring(i, j + 1).toCharArray();
				Arrays.sort(caracter);
				String subCaract = new String(caracter);

				// Confer�ncia das substring encontradas
				if (mapa.containsKey(subCaract)) {
					mapa.put(subCaract, mapa.get(subCaract) + 1);
				} else {
					mapa.put(subCaract, 1);
				}
			}
		}

		// Verifica��o dos anagramas
		int contarOsPares = 0;

		for (String cont : mapa.keySet()) {

			int n = mapa.get(cont);
			contarOsPares += (n * (n - 1)) / 2;
		}
		return contarOsPares;

	}
}
