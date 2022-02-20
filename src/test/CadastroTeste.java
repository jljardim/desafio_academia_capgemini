package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.br.jeferson.cadastro.Cadastro;

class CadastroTeste {

	@Test
	void testSenhaForte() {
		Cadastro cadastro = new Cadastro();
		
		String senha = "JJhh9@";
		boolean resultadoSenhaForte = true;
		
		boolean senhaForte = cadastro.senhaForte(senha);
		
		assertTrue(resultadoSenhaForte == senhaForte);
	}

}
