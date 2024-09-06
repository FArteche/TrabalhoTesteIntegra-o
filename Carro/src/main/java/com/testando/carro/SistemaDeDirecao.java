package com.testando.carro;

public class SistemaDeDirecao {
    private String tipo;
    private boolean assistido;
    private String material;
    private double relacao;
    private String marca;

    public SistemaDeDirecao(String tipo, boolean assistido, String material, double relacao, String marca) {
        this.tipo = tipo;
        this.assistido = assistido;
        this.material = material;
        this.relacao = relacao;
        this.marca = marca;
    }

    public void AjustarDirecao(double angulo) {
        this.relacao = angulo;
    }

    public void VerificarEstado() {
        if (assistido == true) {
            System.out.println("Sistema já está ligado");
        } else if (assistido == false) {
            assistido = true;
            System.out.println("Sistema ligado");
        }
    }

    public void SubstituirComponente(String componente) {

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isAssistido() {
        return assistido;
    }

    public void setAssistido(boolean assistido) {
        this.assistido = assistido;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getRelacao() {
        return relacao;
    }

    public void setRelacao(double relacao) {
        this.relacao = relacao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
