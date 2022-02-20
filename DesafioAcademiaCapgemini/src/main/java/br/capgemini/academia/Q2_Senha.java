package br.capgemini.academia;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Robson Coura Classe para objetos do tipo Q2_Senha, onde ser�o
 *         contidos, valores e m�todos.
 */

public class Q2_Senha {
	/**
	 * Esse m�todo faz uma verifica��o da senha se est� dentro do parametro exigido
	 * pela regras de negocios:
	 * 
	 * Possui no m�nimo 6 caracteres. Cont�m no m�nimo 1 digito. Cont�m no m�nimo 1
	 * letra em min�sculo. Cont�m no m�nimo 1 letra em mai�sculo. Cont�m no m�nimo 1
	 * caractere especial. Os caracteres especiais s�o: !@#$%^&*()-+
	 * 
	 * @param senha - Verifica��o se possui no m�nimo 6 caracteres a senha.
	 * @return retorna - Se a senha esta dentro das regras de negocio para uma senha
	 *         forte.
	 */

	public static boolean validaSenha(String senha) {

		// Verifica��o dos tipos de dados
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

		// Verifica��o da senha
		if (senha.length() < 6) {
			System.out.println("Para sua seguran�a deve conter no m�nimo 6 caracteres para uma senha forte e segura!");
		}

		if (!validaSenha(senha) && senha.length() >= 6) {
			System.out.println(
					"Sua senha deve conter pelo menos 1 n�mero, 1 letra min�scula, 1 letra mai�scula, 1 caracter especial do tipo !@#$%^&*()-+!!");
		}

		if (validaSenha(senha)) {
			System.out.println("Parab�ns sua senha � forte e segura!");
		}
		;
	}

}
