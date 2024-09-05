/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.testando.carro;

/**
 *
 * @author Abner
 */
public class Carro {

    public void acelerar() {
        System.out.println("Carro acelerando");
    }

    public static void main(String[] args) {
        // Criar instâncias das classes envolvidas
        Carro carro = new Carro();
        Motor motor = new Motor();
        Transmissao transmissao = new Transmissao();
        SistemaEletrico sistemaEletrico = new SistemaEletrico();
        Painel painel = new Painel();

        // Realizar as ações de ligar o motor, ativar a transmissão e o sistema elétrico
        motor.ligarMotor();
        transmissao.aumentarMarcha();
        sistemaEletrico.ativarParteEletrica();

        // Exibir o status no painel
        String status = painel.exibirStatus();
        System.out.println("Status do painel:\n" + status);

        // Acelerar o carro
        carro.acelerar();
    }
}
