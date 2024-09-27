package com.testando.carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SuspensaoTest {

    private Suspensao suspensao;
    private Painel painel;
    private Pneus pneu;

    @BeforeEach
    public void setUp() {
        painel = new Painel(null, null, null, false, false);
        pneu = new Pneus(null, null, null, null, 0, 0, true);// Considerando que o pneu já foi removido
        suspensao = new Suspensao("Hidraulica", "Aço", "MarcaX", 15.0, 10, true);
    }

    @Test
    public void testVerificarEstadoSuspensaoBoa() {
        boolean estado = suspensao.verificarEstado(painel);
        assertTrue(estado);

        suspensao.setEstado(false);
        estado = suspensao.verificarEstado(painel);
        assertFalse(estado);
    }

    @Test
    public void testSubstituirSuspensaoComPneuRemovido() {
        suspensao.substituir("Esportiva", "Carbono", "MarcaY", 20.0, 15, true, pneu);
        assertEquals("Esportiva", suspensao.getTipo());
        assertEquals("Carbono", suspensao.getMaterial());
        assertEquals("MarcaY", suspensao.getMarca());
        assertEquals(20.0, suspensao.getAltura());
        assertEquals(15, suspensao.getRigidez());
        assertTrue(suspensao.verificarEstado(painel));
    }
}