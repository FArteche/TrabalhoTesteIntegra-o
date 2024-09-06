package com.testando.carro;

public class Luzes {
    private String tipo;
    private int intensidade;
    private String cor;
    private boolean estado;
    private String modelo;

    public Luzes(String tipo, int intensidade, String cor, boolean estado, String modelo) {
        this.tipo = tipo;
        this.intensidade = intensidade;
        this.cor = cor;
        this.estado = estado;
        this.modelo = modelo;
    }

    public void Ligar() {
        if (estado == true) {
            System.out.println("Luzes já estão ligadas");
        } else if (estado == false) {
            estado = true;
            System.out.println("Luzes Ligada");
        }
    }

    public void Desligar() {
        if (estado == false) {
            System.out.println("Luzes já estão desligadas");
        } else if (estado == true) {
            estado = false;
            System.out.println("Luzes desligadas");
        }
    }

    public void AjustarIntensidade(int novaIntensidade) {
        this.intensidade = novaIntensidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(int intensidade) {
        this.intensidade = intensidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
