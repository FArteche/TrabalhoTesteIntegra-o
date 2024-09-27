/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.testando.carro;

//testarSistema(Se está tudo ok, mostra no painel)
//substituirBateria(Motor precisa estar desligado)
/**
 *
 * @author Abner
 */
public class SistemaEletrico {

    private double voltagem;
    private double capacidade;
    private String tipoDeBateria;
    private boolean estado;
    private String marca;

    public SistemaEletrico(double voltagem, double capacidade, String tipoDeBateria, boolean estado, String marca) {
        this.voltagem = voltagem;
        this.capacidade = capacidade;
        this.tipoDeBateria = tipoDeBateria;
        this.estado = estado;
        this.marca = marca;
    }

    public boolean verificarBateria() {
        return estado;
    }

    public void substituirBateria(double voltagem, double capacidade, String tipoDeBateria, boolean estado,
            String marca, Motor motor) {
        if (!motor.verificarEstado()) {
            this.voltagem = voltagem;
            this.capacidade = capacidade;
            this.tipoDeBateria = tipoDeBateria;
            this.estado = estado;
            this.marca = marca;
        }
    }

    public boolean testarSistema(Painel painel) {
        if (voltagem >= 13 && voltagem <= 15 && estado) {
            painel.atualizarInformações("Sistema elétrico funcional");
            return true;
        }else{
            return false;
        }
    }

    public void ativarParteEletrica() {
        if (!estado) {
            estado = true;
        }
    }

    public void desativarParteEletrica() {
        if (estado = true) {
            estado = false;
        }
    }

    public double getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(double voltagem) {
        this.voltagem = voltagem;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public String getTipoDeBateria() {
        return tipoDeBateria;
    }

    public void setTipoDeBateria(String tipoDeBateria) {
        this.tipoDeBateria = tipoDeBateria;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
