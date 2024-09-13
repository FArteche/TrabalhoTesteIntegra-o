/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.testando.carro;

// Métodos de integração(abrir/fechar) //
/**
 *
 * @author IFSul
 */
public class Portas {
    private int quantidade;
    private String material, cor, tipo, estado;

    public Portas(int quantidade, String material, String cor, String tipo, String estado) {
        this.cor = cor;
        this.estado = estado;
        this.material = material;
        this.quantidade = quantidade;
        this.tipo = tipo;
    }

    public void abrir(Luzes luz, SistemaEletrico eletrico) {
        estado = "aberto";
        luz.Ligar(eletrico);
    }

    public void fechar(Luzes luz) {
        estado = "fechado";
        luz.Desligar();
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String verificarEstado() {
        return estado;
    }
}
