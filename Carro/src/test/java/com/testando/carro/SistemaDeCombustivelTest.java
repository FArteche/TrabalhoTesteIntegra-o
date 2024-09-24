package com.testando.carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SistemaDeCombustivelTest {

    private SistemaDeCombustivel sistemaDeCombustivel;
    private Painel painel;
    private Motor motor;
    private SistemaEletrico eletrico;

    @BeforeEach
    public void setUp() {
        sistemaDeCombustivel = new SistemaDeCombustivel("Gasolina", 50.0, 5.0, "MarcaX", true);
        painel = new Painel(null, null, null, false, false);
        motor = new Motor(null, 0, 0, "MarcaY", false); // Motor desligado
        eletrico = new SistemaEletrico(0, 0, null, true, null);
    }

    @Test
    public void testVerificarNivelCombustivelBaixo() {
        painel.ligarDisplay(eletrico);
        sistemaDeCombustivel.setNivelDeCombustivel(2.0); // Nível baixo
        sistemaDeCombustivel.verificarNivel(painel);
        assertEquals("Nível do combustivel baixo.", painel.getDisplay());
    }

    @Test
    public void testVerificarNivelCombustivelMedio() {
        painel.ligarDisplay(eletrico);
        sistemaDeCombustivel.setNivelDeCombustivel(5.0); // Nível médio
        sistemaDeCombustivel.verificarNivel(painel);
        assertEquals("Nível do combustivel médio", painel.getDisplay());
    }

    @Test
    public void testVerificarNivelCombustivelAlto() {
        painel.ligarDisplay(eletrico);
        sistemaDeCombustivel.setNivelDeCombustivel(15.0); // Nível alto
        sistemaDeCombustivel.verificarNivel(painel);
        assertEquals("Nível do combustivel Alto", painel.getDisplay());
    }

    @Test
    public void testAbastecerComMotorDesligado() {
        sistemaDeCombustivel.Abastecer(40.0, motor); // Motor desligado, deve abastecer
        assertEquals(40.0, sistemaDeCombustivel.getNivelDeCombustivel());
    }

    @Test
    public void testNaoAbastecerComMotorLigado() {
        motor.ligarMotor(eletrico, sistemaDeCombustivel); // Ligando o motor
        sistemaDeCombustivel.Abastecer(40.0, motor); // Tentativa de abastecer com o motor ligado
        assertNotEquals(40.0, sistemaDeCombustivel.getNivelDeCombustivel());
    }
}
