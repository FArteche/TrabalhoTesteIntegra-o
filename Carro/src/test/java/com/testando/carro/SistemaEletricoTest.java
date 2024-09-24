package com.testando.carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SistemaEletricoTest {

    private SistemaEletrico sistemaEletrico;
    private Motor motor;
    private Painel painel;

    @BeforeEach
    public void setUp() {
        // Inicializando com valores fictícios para teste
        sistemaEletrico = new SistemaEletrico(14.0, 80.0, "Íon de Lítio", false, "MarcaX");
        motor = new Motor(null, 0, 0, null, false); // Motor desligado
        painel = new Painel(null, null, null, false, false); // Considerando que a classe Painel está implementada
    }

    @Test
    public void testVerificarBateria() {
        sistemaEletrico.setEstado(true);
        assertTrue(sistemaEletrico.verificarBateria());

        sistemaEletrico.setEstado(false);
        assertFalse(sistemaEletrico.verificarBateria());
    }

    @Test
    public void testTestarSistemaFuncional() {
        sistemaEletrico.setEstado(true);
        boolean resultado = sistemaEletrico.testarSistema(painel);
        assertTrue(resultado);

        sistemaEletrico.setVoltagem(12.0); // Voltagem abaixo do esperado
        resultado = sistemaEletrico.testarSistema(painel);
        assertFalse(resultado);
    }

    @Test
    public void testAtivarParteEletrica() {
        sistemaEletrico.ativarParteEletrica();
        assertTrue(sistemaEletrico.isEstado());
    }
}
