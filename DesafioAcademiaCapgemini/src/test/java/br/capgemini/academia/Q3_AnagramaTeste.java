package br.capgemini.academia;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.capgemini.academia.Q3_Anagrama;

public class Q3_AnagramaTeste {
	
	@Test
	@DisplayName("Verificação de pares de anagramas")
	void TesteAnagrama() {
		Q3_Anagrama pares = new Q3_Anagrama();
		String var = "ifailuhkqq";
		assertEquals(3, pares.anagrama(var));
	}
}
