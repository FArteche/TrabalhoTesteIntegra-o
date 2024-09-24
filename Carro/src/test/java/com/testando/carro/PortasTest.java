package com.testando.carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PortasTest {

    private Portas portas;
    private Luzes luz;
    private SistemaEletrico sistemaEletrico;

    @BeforeEach
    public void setUp() {
        portas = new Portas(4, "Alumínio", "Preto", "Automática", "fechado");
        luz = new Luzes(null, 0, null, false, null);
        sistemaEletrico = new SistemaEletrico(12.5, 100.0, "Li-ion", true, "MarcaX");
    }

    @Test
    public void testAbrirPorta() {
        portas.abrir(luz, sistemaEletrico);
        assertEquals("aberto", portas.verificarEstado());
        assertTrue(luz.isEstado());
    }

    @Test
    public void testFecharPorta() {
        portas.abrir(luz, sistemaEletrico);
        portas.fechar(luz);
        assertEquals("fechado", portas.verificarEstado());
        assertFalse(luz.isEstado());
    }
}
