package com.testando.carro;

// Integrações (LiberarDirecao/LigarSeta/DesligarSeta)
public class SistemaDeDirecao {
    private String tipo; //
    private boolean assistido, estado;
    private String material;
    private double relacao;
    private String marca;
    private int seta = 0; // 0 neutro, 1 esquerda, 2 direita

    public SistemaDeDirecao(String tipo, boolean assistido, String material, double relacao, String marca, boolean estado) {
        this.tipo = tipo;
        this.assistido = assistido;
        this.material = material;
        this.relacao = relacao;
        this.marca = marca;
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public int getSeta() {
        return seta;
    }

    public void AjustarDirecao(double angulo) {
        this.relacao = angulo;
    }

    public void VerificarEstado() {
        if (assistido == true) {
            System.out.println("Sistema já está ligado");
        } else {
            assistido = true;
            System.out.println("Sistema ligado");
        }
    }

    public void LiberarDirecao(Motor motor) {
        if (motor.verificarEstado()) {
            estado = true;
        } else {
            estado = false;
        }
    }

    public void TrancarDirecao(Motor motor) {
        if (!motor.verificarEstado()) {
            estado = false;
        }
    }

    public void LigarSeta(Luzes luz, SistemaEletrico eletrico) {
        if (seta == 1 || seta == 2) {
            luz.Ligar(eletrico);
        }
    }

    public void DesligarSeta(Luzes luz) {
        if (relacao > -22.5 && relacao < 22.5) {
            luz.Desligar();
        }
    }

    public boolean getEstado() {
        return estado;
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
