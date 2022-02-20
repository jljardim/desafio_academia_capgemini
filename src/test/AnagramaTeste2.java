package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.br.jeferson.anagrama.Anagrama;

class AnagramaTeste2 {

	@Test
	void testMostraPalavraAnagrama() {
		Anagrama anagrama = new Anagrama();
		
		String string1 = "amor";
		String string2 = "ramo";
		boolean resultadoEsperado = true;
		
		boolean confereSeEAnagrama = anagrama.confereSeEAnagrama(string1, string2);
		
		assertTrue(resultadoEsperado == confereSeEAnagrama);
	}

	@Test
	void testConfereSeEAnagrama() {
		Anagrama anagrama = new Anagrama();
		
		String string1 = "amor";
		String string2 = "ramo";
		
		boolean resultado = anagrama.confereSeEAnagrama(string1, string2);
		
		boolean resultadoEsperado = true;
		
		assertTrue(resultado == resultadoEsperado);
	}

}
