/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.testando.carro;

import static java.util.Arrays.asList;
import java.util.List;
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
public class MotorTest {
    Motor motor;
    SistemaEletrico eletrico;
    SistemaDeCombustivel combustivel;
    Painel painel;
    
    public MotorTest() {
        motor = new Motor("Gasolina", 150, 12, "Mercedes", false);
        eletrico = new SistemaEletrico(14, 500, "Elétrica", false, "Moura");
        combustivel = new SistemaDeCombustivel("GNV", 50, 25, "Mercedes", true);
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
     * Test of mostrarEspecificações method, of class Motor.
     */
    @Test
    public void testMostrarEspecificações() {
        String expectedString = "Tipo: Gasolina"
                        + "\nPotencia: 150"
                        + "\nCilindradas: 12.0"
                        + "\nmarca: Mercedes";
        motor.mostrarEspecificações(painel);
        
        List<String> expectedResult = asList(expectedString);
        List<String> result = asList(painel.getDisplay());
        
        assertLinesMatch(expectedResult, result);
    }

    /**
     * Test of ligarMotor method, of class Motor.
     */
    @Test
    public void testLigarMotor() {
        motor.ligarMotor(eletrico, combustivel);
        assertFalse(motor.verificarEstado());
    }
}
