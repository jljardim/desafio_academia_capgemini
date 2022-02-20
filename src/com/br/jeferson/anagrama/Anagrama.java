package com.br.jeferson.anagrama;

import java.util.Scanner;

public class Anagrama {
	
	
	@SuppressWarnings("resource")
	public static String scanner() {
	    Scanner scanner = new Scanner(System.in);
	    String string = scanner.nextLine();
	    return string;
	}
	
	
	@SuppressWarnings("resource")
	public void  mostraPalavraAnagrama() {
		
		System.out.println("Informe a Primeira palavra para compara��o");
		String string11 = scanner();
		
		System.out.println("Informe a Segunda palavra para compara��o");
		String string22 = scanner();
		
		
		 if(confereSeEAnagrama(string11, string22)) {
			
			System.out.println( "� uma palavra Anagrama" );
			
		}else {
			
			System.out.println("N�o � uma palavra Anagrama");
			
		}
		
	}

	public  boolean confereSeEAnagrama(String string1, String string2) {
		int resultado = 0;
		
		for(int i = 0; i < string1.length(); i++) {
			resultado = resultado ^ string1.charAt(i);
		}
		
		for(int i = 0; i < string2.length(); i++) {
			resultado = resultado ^ string2.charAt(i);
		}
		
		return (resultado == 0);
	}

}
