/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.testando.carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author faart
 */
public class PneusTest {
    Pneus pneu;
    Painel painel;
    Suspensao suspensao1, suspensao2;

    public PneusTest() {
        pneu = new Pneus("21", "Comum", "Goodyear", "Bom", 23, 4, false);
        painel = new Painel("Digital", "", "Mercedes", true, true);
        suspensao1 = new Suspensao("Eixo Rigido", "Aço", "ACDELCO", 15, 1600, true);
        suspensao2 = new Suspensao("Eixo Rigido", "Aço", "ACDELCO", 15, 800, true);
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of desgastePneu method, of class Pneus.
     */
    @Test
    public void testDesgastePneu() {
        double desgasteResult[] = { 0, 0 };
        double desgasteExpectedResult[] = { 8, 9.5 };
        pneu.desgastePneu(suspensao1);
        desgasteResult[0] = pneu.getDesgaste();
        pneu.desgastePneu(suspensao2);
        desgasteResult[1] = pneu.getDesgaste();

        assertArrayEquals(desgasteExpectedResult, desgasteResult);
    }

    /**
     * Test of verificarPressao method, of class Pneus.
     */
    @Test
    public void testVerificarPressao() {
        pneu.verificarPressao(painel);
        assertEquals("Pressão atual: 23.0", painel.getDisplay());
    }
}
