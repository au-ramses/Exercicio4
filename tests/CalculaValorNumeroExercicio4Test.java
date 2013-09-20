package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import calculaValor.CalculaValorNumero;
import calculaValor.CalculaValorNumeroExercicio4;

public class CalculaValorNumeroExercicio4Test {

	CalculaValorNumeroExercicio4 novoCalculoNumeroExercicio4;
	CalculaValorNumero novoCalculo;
	
	@Before
	public void setUp() throws Exception {
		novoCalculoNumeroExercicio4 = new CalculaValorNumeroExercicio4();
		novoCalculo = new CalculaValorNumero();
	}

	@Test
	public void CalculaValorNumeroQuadradoTestNumeroZero() {
		assertEquals(novoCalculo.CalculaValorNumeroQuadrado(0.0) , (novoCalculoNumeroExercicio4.CalculaValorNumeroQuadrado(0.0)),0.1);
	}
	
	@Test
	public void CalculaValorNumeroQuadradoTestNumeroPequenoPositivo() {
		assertEquals(novoCalculo.CalculaValorNumeroQuadrado(2.0), novoCalculoNumeroExercicio4.CalculaValorNumeroQuadrado(2.0),0.1);
	}
	
	@Test
	public void CalculaValorNumeroQuadradoTestNumeroGrandePositivo() {
		assertEquals(novoCalculo.CalculaValorNumeroQuadrado(1000000.0), novoCalculoNumeroExercicio4.CalculaValorNumeroQuadrado(1000000.0),0.1);
	}
	
	@Test
	public void CalculaValorNumeroQuadradoTestNumeroPequenoNegativo() {
		assertEquals(novoCalculo.CalculaValorNumeroQuadrado(-2.0), novoCalculoNumeroExercicio4.CalculaValorNumeroQuadrado(-2.0),0.1);
	}
	
	@Test
	public void CalculaValorNumeroQuadradoTestNumeroGrandaNegativo() {
		assertEquals(novoCalculo.CalculaValorNumeroQuadrado(-1000000.0), novoCalculoNumeroExercicio4.CalculaValorNumeroQuadrado(-1000000.0),0.1);
	}
	
	@Test
	public void CalculaValorNumeroCuboTestNumeroZero() {
		assertEquals(novoCalculo.CalculaValorNumeroCubo(0.0), novoCalculoNumeroExercicio4.CalculaValorNumeroCubo(0.0),0.1);
	}
	
	@Test
	public void CalculaValorNumeroCuboTestNumeroPequenoPositivo() {
		assertEquals(novoCalculo.CalculaValorNumeroCubo(2.0), novoCalculoNumeroExercicio4.CalculaValorNumeroCubo(2.0),0.1);
	}
	
	@Test
	public void CalculaValorNumeroCuboTestNumeroGrandePositivo() {
		assertEquals(novoCalculo.CalculaValorNumeroCubo(1000000.0), novoCalculoNumeroExercicio4.CalculaValorNumeroCubo(1000000.0),0.1);
	}
	
	@Test
	public void CalculaValorNumeroCuboTestNumeroPequenoNegativo() {
		assertEquals(novoCalculo.CalculaValorNumeroCubo(-2.0), novoCalculoNumeroExercicio4.CalculaValorNumeroCubo(-2.0),0.1);
	}
	
	@Test
	public void CalculaValorNumeroCuboTestNumeroGrandaNegativo() {
		assertEquals(novoCalculo.CalculaValorNumeroCubo(-1000000.0), novoCalculoNumeroExercicio4.CalculaValorNumeroCubo(-1000000.0),0.1);
	}

}
