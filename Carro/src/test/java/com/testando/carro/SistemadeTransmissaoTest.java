package com.testando.carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SistemadeTransmissaoTest {

    private SistemadeTransmissao transmissao;
    private SistemaEletrico sistemaEletrico;
    private Luzes luz;

    @BeforeEach
    public void setUp() {
        transmissao = new SistemadeTransmissao("Automática", 6, "Alumínio", "MarcaX", true);
        sistemaEletrico = new SistemaEletrico(14.0, 80.0, "Íon de Lítio", true, "MarcaX");
        luz = new Luzes(null, 0, null, false, null);
    }

    @Test
    public void testTrocarRe() {
        transmissao.trocarRe(1, luz, sistemaEletrico);
        assertTrue(luz.isEstado());
    }

    @Test
    public void testVerificarEstadoCaixaMarcha() {
        assertTrue(transmissao.verificarEstado());
        transmissao.setEstado(false);
        assertFalse(transmissao.verificarEstado());
    }

    @Test
    public void testSubstituirCaixaDeMarcha() {
        transmissao.setEstado(false);
        transmissao.substituirCaixadeMarcha();
        assertTrue(transmissao.verificarEstado());
    }
}
