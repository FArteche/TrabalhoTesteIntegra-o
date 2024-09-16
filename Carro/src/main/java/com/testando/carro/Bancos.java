package com.testando.carro;
//ajustarEncosto e ajustarAltura foram alterados para atualizar o painel
//toda vez que forem alterados
public class Bancos {

    private int quantidade;
    private String material;
    private String cor;
    private String tipo;
    private String estado;
    private double altura;

    public Bancos(int quantidade, String material, String cor, String tipo, String estado, double altura) {
        this.quantidade = quantidade;
        this.material = material;
        this.cor = cor;
        this.tipo = tipo;
        this.estado = estado;
        this.altura = altura;
    }

    public void ajustarEncosto(String posicao, Painel painel) {
        this.estado = posicao;
        painel.atualizarInformações("Posicao do banco ajustada para ");
    }

    public void ajustarAltura(double novaAltura, Painel painel) {
        this.altura = novaAltura;
        painel.atualizarInformações("Altura do banco ajustada para "+novaAltura);
    }

    public void verificarEstado() {
        System.out.println("O banco está na posição: " + estado);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
