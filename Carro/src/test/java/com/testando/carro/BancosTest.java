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
public class BancosTest {
    Painel painel;
    Bancos bancos;
    
    public BancosTest() {
        painel = new Painel("Led", "Reclinado", "Toshiba", true, true);
        bancos = new Bancos(4, "Courso", "Branco", "Normal", "Normal", 1.8);
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
     * Ajusta a posição do banco para "Reto" / Resultado não pode ser "Deitado"
     * Verificação realizada através da visualização da mensagem do painel
     */
    @Test
    public void testAjustarEncosto() {
        System.out.println("Posicao inicial: "+bancos.getEstado());
        bancos.ajustarEncosto("Reto", painel);
        System.out.println(painel.getDisplay());
        assertNotEquals("Posicao do banco ajustada para deitado", painel.getDisplay());
    }

    /**
     * Ajusta a altura do banco para -1 / Resultado deve ser 0, já que qualquer valor menor que 0 deve ser ajustado para 0
     * Verificação realizada através da visualização da mensagem do painel
     */
    @Test
    public void testAjustarAltura() {
        System.out.println("Altura inicial: "+bancos.getAltura());
        bancos.ajustarAltura(-1, painel);
        System.out.println(painel.getDisplay());
        assertEquals("Altura do banco ajustada para 0.0", painel.getDisplay());
    }
}
