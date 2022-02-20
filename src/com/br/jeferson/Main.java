package com.br.jeferson;

import com.br.jeferson.anagrama.Anagrama;
import com.br.jeferson.cadastro.Cadastro;
import com.br.jeferson.escada.Escada;

public class Main {
   public static void main(String[] args) {
	   
	Escada escada = new Escada();
	escada.escada();
	
	System.out.println("\n");
	
	Cadastro cadastro = new Cadastro();
	cadastro.cadastro();
	
	System.out.println("\n");
	
	Anagrama anagrama = new Anagrama();
	anagrama.mostraPalavraAnagrama();
}
}
