package com.br.jeferson.cadastro;

import java.util.Scanner;

public class Cadastro {
	public  void  cadastro() {
		System.out.println("Bem vindo ao cadastro de contas vamos come ar:");
		System.out.println("Informe seu nome: ");

		@SuppressWarnings("resource")
		Scanner scannerNome = new Scanner(System.in);
		String nome = scannerNome.nextLine();

		while (nome.isEmpty()) {
			System.out.println("Nome n o pode ser vazio!");
			nome = scannerNome.nextLine();
			
		}
		if (!nome.isEmpty()) {
			System.out.println("\n Nome salvo com sucesso! \n");
		}
		
		System.out.println("Informe uma senha:");
		System.out.println("A senha deve conter no minimo 6 caracteres, um numero, uma letra maiuscula, "
				+ "uma letra minuscula e um caractere especial");
		
		@SuppressWarnings("resource")
		Scanner scannerSenha = new Scanner(System.in);
		String senha = scannerSenha.nextLine();
		
		while (senhaForte(senha) == false) {
			System.out.println("**** SENHA INVALIDA ****");
			System.out.println("A senha deve conter no minimo 6 caracteres,um numero, uma LETRA MAIUSCULA, "
					+ "uma LETRA MINUSCULA e um CARACTERE ESPECIAL");

			  senha = scannerSenha.nextLine();
		}
		
		if (senhaForte(senha) == true) {
			System.out.println("**** SENHA SALVA COM SUCESSO ****!!");
		}

	}
	
	public  boolean senhaForte(String senha) {
		
		if (senha.length() != 6) return false;

		boolean achouNumero = false;
		boolean achouMaiuscula = false;
		boolean achouMinuscula = false;
		boolean achouSimbolo = false;
		for (char c : senha.toCharArray()) {
			if (c >= '0' && c <= '9') {
				achouNumero = true;
			} else if (c >= 'A' && c <= 'Z') {
				achouMaiuscula = true;
			} else if (c >= 'a' && c <= 'z') {
				achouMinuscula = true;
			} else {
				achouSimbolo = true;
			}
		}
		return achouNumero && achouMaiuscula && achouMinuscula && achouSimbolo;
	}

}

