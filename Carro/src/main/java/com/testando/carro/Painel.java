/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.testando.carro;

/**
 *
 * @author Abner
 */
public class Painel {

    private String tipo, display, marca;
    private boolean controle/*
                             * Verifica se todos os componentes estão funcionando(motor ligado, painel
                             * ligado, etc
                             */, estado;

    public Painel(String tipo, String display, String marca, boolean controle, boolean estado) {
        this.tipo = tipo;
        this.display = display;
        this.estado = estado;
        this.marca = marca;
        this.tipo = tipo;
    }

    public void atualizarInformações(String info) {
        this.display = info;
    }

    public void ligarDisplay() {
        if (estado) {
            System.out.println("Display já está ligado");
        } else {
            estado = true;
        }
    }

    public void desligarDisplay() {
        if (!estado) {
            System.out.println("Display já está desligado");
        } else {
            estado = false;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDisplay() {
        if (!estado) {
            return "Display desligado";
        }
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isControle() {
        return controle;
    }

    public void setControle(boolean controle) {
        this.controle = controle;
    }

    public boolean isEstado() {
        return estado;
    }
}
