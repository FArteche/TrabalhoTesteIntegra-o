/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.testando.carro;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author faart
 */
public class FreiosTest {

    Freios freios;
    Luzes luz;
    SistemaEletrico eletrico;
    Painel painel;

    public FreiosTest() {
        freios = new Freios("ABS", "Aço", "Cobreq", 83.3, 9.8);
        luz = new Luzes("Luz de Freio", 1, "Vermelha", false, "Nome de lampada");
        eletrico = new SistemaEletrico(14, 500, "Elétrica", true, "Moura");
        painel = new Painel("Digital", "", "Mercedes", true, true);
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
     * Verifica se o desgaste do freio está sendo aplicado corretamente e se as luzes de freio estão acendendo corretamente
     */
    @Test
    public void testFrear() {
        freios.frear(luz, eletrico);
        assertAll(
                "Deve acender a luz de freio e gastar o freio",
                    ()-> assertEquals(9.9,freios.verificarDesgaste()),
                    ()-> assertTrue(luz.isEstado())
                );
    }

    /**
     * Verifica se o aviso de desgaste dos freio está sendo disparado corretamente
     * Após cada freada o desgaste do freio é verificado, quando ele chegar ou passar de 10 o aviso deve ser disparado via painel
     */
    @Test
    public void testAvisoDesgaste() {
        String painelExpectedOutput[] = {"", "Freios desgastados, realize a manutenção"};
        double freioExpectedDesgaste[] = {9.9,10};
        String painelOutput[] = {"",""};
        double freioDesgaste[] = {0,0};
        //Primeira freada
        freios.frear(luz, eletrico);
        freios.avisoDesgaste(painel);
        painelOutput[0] = painel.getDisplay();
        freioDesgaste[0] = freios.verificarDesgaste();
        //Segunda Freada
        freios.frear(luz, eletrico);
        freios.avisoDesgaste(painel);
        painelOutput[1] = painel.getDisplay();
        freioDesgaste[1] = freios.verificarDesgaste();
        assertAll(
                "Desgaste deve ser 9.9 após a primeira freada e 10.0 na segunda, disparando o aviso no painel",
                    ()-> assertArrayEquals(painelExpectedOutput, painelOutput),
                    ()-> assertArrayEquals(freioExpectedDesgaste, freioDesgaste)
                );
    }
}
