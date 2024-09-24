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
public class CarroTest {
    Motor motor;
    Painel painel;
    SistemaDeDirecao direcao;
    SistemadeTransmissao transmissao;
    SistemaEletrico eletrico;
    SistemaDeCombustivel combustivel;
    Carro carro;
    
    public CarroTest() {
        motor = new Motor("Gasolina", 150, 12, "Mercedes", false);
        painel = new Painel("Digital", "", "Mercedes", false, false);
        direcao = new SistemaDeDirecao("Elétrica", true, "Fibra de Carbono", 0, "Mercedes", false);
        transmissao = new SistemadeTransmissao("Manual", 6, "Aço", "Mercedes", true);
        eletrico = new SistemaEletrico(14, 500, "Elétrica", false, "Moura");
        combustivel = new SistemaDeCombustivel("GNV", 50, 25, "Mercedes", true);
        carro = new Carro();
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
     * Test of ligarCarro method, of class Carro.
     */
    @Test
    public void testLigarCarro() {
        carro.ligarCarro(motor, painel, direcao, transmissao, eletrico, combustivel);
        assertTrue(carro.isLigado());
    }

    /**
     * Test of desligarCarro method, of class Carro.
     */
    @Test
    public void testDesligarCarro() {
        carro.desligarCarro(motor, painel, direcao, transmissao, eletrico, combustivel);
        assertFalse(carro.isLigado());
    }    
}
