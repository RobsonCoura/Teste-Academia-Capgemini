package br.capgemini.academia;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.capgemini.academia.Q2_Senha;

public class Q2_SenhaTeste {
	
	@Test
	@DisplayName("Verificação se a senha é valida!")
	void verificacaoSenha() {
		Q2_Senha usuario = new Q2_Senha();
		String var = "Ya3&ab";
		assertTrue(usuario.validaSenha(var));
	
	}


}
