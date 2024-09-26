package com.testando.carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SistemaDeDirecaoTest {

    private SistemaDeDirecao direcao;
    private Motor motor;
    private Luzes luz;
    private SistemaEletrico sistemaEletrico;

    @BeforeEach
    public void setUp() {
        direcao = new SistemaDeDirecao("Hidráulica", false, "Aço", 14.0, "MarcaX", true);
        motor = new Motor(null, 0, 0, null, false); // Simulando que o motor está ligado
        luz = new Luzes(null, 0, null, true, null); // Supondo que Luzes tenha um construtor padrão
        sistemaEletrico = new SistemaEletrico(14.0, 100.0, "Íon de Lítio", true, "MarcaX");
    }

    @Test
    public void testVerificarEstadoAssistido() {
        direcao.VerificarEstado();
        assertTrue(direcao.isAssistido());
    }

    @Test
    public void testLiberarDirecaoComMotorLigado() {
        motor.setEstado(true);
        direcao.LiberarDirecao(motor);
        assertTrue(direcao.getEstado());
    }

    @Test
    public void testLiberarDirecaoComMotorDesligado() {
        motor.setEstado(false);
        direcao.LiberarDirecao(motor);
        assertFalse(direcao.getEstado());
    }

    @Test
    public void testTrancarDirecaoComMotorDesligado() {
        motor.setEstado(false);
        direcao.TrancarDirecao(motor);
        assertFalse(direcao.getEstado());
    }

    @Test
    public void testLigarSeta() {
        direcao.LigarSeta(luz, sistemaEletrico);
        assertTrue(luz.isEstado());
    }

    @Test
    public void testDesligarSeta() {
        direcao.AjustarDirecao(0.0);
        direcao.DesligarSeta(luz);
        assertFalse(luz.isEstado());
    }
}
