/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.testando.carro;

//desgastePneu (usa a rigidez da suspensao para aplicar o desgaste)
//verificarPressao (mostra a pressao atual do pneu no painel)
/**
 *
 * @author IFSul
 */
public class Pneus {

    private String tamanho, tipo, marca, estado;
    private double pressao, desgaste;
    private boolean removido;

    public Pneus(String tamanho, String tipo, String marca, String estado, double pressao, double desgaste,
            boolean removido) {
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.marca = marca;
        this.estado = estado;
        this.pressao = pressao;
        this.desgaste = desgaste;
        this.removido = removido;
    }

    public void desgastePneu(Suspensao suspensao) {
        if (suspensao.getRigidez() <= 500) {
            desgaste += 5.0;
        }
        else if (suspensao.getRigidez() <= 1500) {
            desgaste += 1.5;
        } else {
            desgaste += 4.0;
        }
    }

    public void verificarPressao(Painel painel) {
        painel.atualizarInformações("Pressão atual: " + pressao);
    }

    public void ajustarPressao(double novaPressao) {
        pressao = novaPressao;
    }

    public void substituirPneu(String tamanho, String tipo, String marca, double pressao) {
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.marca = marca;
        this.estado = "Bom";
        this.pressao = pressao;
    }

    public boolean isRemovido() {
        return removido;
    }

    public void setRemovido(boolean removido) {
        this.removido = removido;
    }

    public double getDesgaste() {
        return desgaste;
    }

    public void setDesgaste(double desgaste) {
        this.desgaste = desgaste;
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
