package br.capgemini.academia;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Robson Coura Classe para objetos do tipo Q2_Senha, onde serão
 *         contidos, valores e métodos.
 */

public class Q2_Senha {
	/**
	 * Esse método faz uma verificação da senha se está dentro do parametro exigido
	 * pela regras de negocios:
	 * 
	 * Possui no mínimo 6 caracteres. Contém no mínimo 1 digito. Contém no mínimo 1
	 * letra em minúsculo. Contém no mínimo 1 letra em maiúsculo. Contém no mínimo 1
	 * caractere especial. Os caracteres especiais são: !@#$%^&*()-+
	 * 
	 * @param senha - Verificação se possui no mínimo 6 caracteres a senha.
	 * @return retorna - Se a senha esta dentro das regras de negocio para uma senha
	 *         forte.
	 */

	public static boolean validaSenha(String senha) {

		// Verificação dos tipos de dados
		String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[!@#$%^&*()-+])" + "(?=\\S+$).{6}$";

		Pattern p = Pattern.compile(regex);

		if (senha == null) {
			return false;
		}
		Matcher m = p.matcher(senha);
		return m.matches();
	}

	public static void main(String[] args) {

		// Leitura de dados
		Scanner entrada = new Scanner(System.in);

		String nome;

		System.out.println("Digite seu nome: ");
		nome = entrada.nextLine();

		System.out.println("Digite sua senha: ");
		String senha = entrada.next();
		entrada.close();

		// Verificação da senha
		if (senha.length() < 6) {
			System.out.println("Para sua segurança deve conter no mínimo 6 caracteres para uma senha forte e segura!");
		}

		if (!validaSenha(senha) && senha.length() >= 6) {
			System.out.println(
					"Sua senha deve conter pelo menos 1 número, 1 letra minúscula, 1 letra maiúscula, 1 caracter especial do tipo !@#$%^&*()-+!!");
		}

		if (validaSenha(senha)) {
			System.out.println("Parabéns sua senha é forte e segura!");
		}
		;
	}

}
