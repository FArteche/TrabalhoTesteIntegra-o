/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.testando.carro;

/**
 *
 * @author Abner
 */
public class Motor {

    private String tipo;
    private int potencia;
    private double cilindrada;
    private String marca;
    private boolean estado;

    public Motor(String tipo, int potencia, double cilindrada, String marca, boolean estado) {
        this.tipo = tipo;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.marca = marca;
        this.estado = estado;
    }

    public void mostrarEspecificações(Painel painel) {
        painel.atualizarInformações(
                "Tipo: " + tipo
                        + "\nPotencia: " + potencia
                        + "\nCilindradas: " + cilindrada
                        + "\nmarca: " + marca);
    }

    public void ligarMotor(SistemaEletrico eletrico, SistemaDeCombustivel combustivel) {
        if (eletrico.isEstado() && combustivel.getNivelDeCombustivel() > 0) {
            estado = true;
        } else {
            estado = false;
        }
    }

    public void desligarMotor() {
        estado = false;
    }

    public boolean verificarEstado() {
        return estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
