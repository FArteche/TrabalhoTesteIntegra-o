/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.testando.carro;

/**
 *
 * @author IFSul
 */
public class Pneus {
    private String tamanho, tipo, marca, estado;
    private double pressao;

    public Pneus(String tamanho, String tipo, String marca, String estado, double pressao) {
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.marca = marca;
        this.estado = estado;
        this.pressao = pressao;
    }

    public double verificarPressao() {
        return pressao;
    }

    public void ajustarPressao(double novaPressao) {
        pressao = novaPressao;
    }

    public void substituirPneu(String tamanho, String tipo, String marca, String estado, double pressao) {
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.marca = marca;
        this.estado = estado;
        this.pressao = pressao;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
