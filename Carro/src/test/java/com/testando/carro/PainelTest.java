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
public class PainelTest {
    Painel painel;
    SistemaEletrico eletrico;
    Motor motor;
    SistemaDeCombustivel combustivel;
    SistemaDeDirecao direcao;
    SistemadeTransmissao transmissao;
    
    public PainelTest() {
        painel = new Painel("Digital", "", "Mercedes", false, false);
        eletrico = new SistemaEletrico(14, 500, "Elétrica", true, "Moura");
        motor = new Motor("Gasolina", 150, 12, "Mercedes", true);
        combustivel = new SistemaDeCombustivel("GNV", 50, 25, "Mercedes", true);
        direcao = new SistemaDeDirecao("Elétrica", true, "Fibra de Carbono", 0, "Mercedes", true);
        transmissao = new SistemadeTransmissao("Manual", 6, "Aço", "Mercedes", true);
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
     * Se o sistema elétrico estiver funcionando, o painel irá ligar 
     **/
    @Test
    public void testLigarDisplay() {
        painel.ligarDisplay(eletrico);
        assertTrue(painel.isEstado());
    }


    /**
     * Verifica se todos os componentes principais estão funcionando corretamente
     */
    @Test
    public void testSetControle() {
        painel.ligarDisplay(eletrico);
        painel.setControle(motor, eletrico, combustivel, direcao, transmissao);
        assertAll(
                "Todos componentes tem que estar com estado true para controle receber true",
                ()-> assertTrue(painel.isControle()),
                ()-> assertEquals("Componentes principais estão funcionando corretamente", painel.getDisplay())
        );
    }
}
