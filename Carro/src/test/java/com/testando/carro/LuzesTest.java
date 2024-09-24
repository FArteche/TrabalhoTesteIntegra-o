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
public class LuzesTest {
    Luzes luzes;
    SistemaEletrico eletrico;
    Painel painel;
    
    public LuzesTest() {
        luzes = new Luzes("Luz de Freio", 1, "Vermelha", false, "Nome de lampada");
        eletrico = new SistemaEletrico(14, 500, "Elétrica", false, "Moura");
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
     * Test of Ligar method, of class Luzes.
     */
    @Test
    public void testLigar() {
        luzes.Ligar(eletrico);
        assertFalse(luzes.isEstado());
    }

    
    @Test
    public void testAjustarIntensidade() {
        eletrico.ativarParteEletrica();
        
        String intensidadeExpectedResult [] = {"Luz alta ligada","Luz baixa ligada","Luz de posição ligada","Luz de posição ligada"};
        String intensidadeResult [] = {"","","",""};
        
        int intensidadeValor[] = {2,1,0,100};
        
        for(int i = 0; i<4; i++){
            luzes.AjustarIntensidade(intensidadeValor[i], painel);
            intensidadeResult[i] = painel.getDisplay();
        }
        
        assertArrayEquals(intensidadeExpectedResult, intensidadeResult);
    }
}
