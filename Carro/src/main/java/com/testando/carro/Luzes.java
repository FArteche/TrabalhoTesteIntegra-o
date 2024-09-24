package com.testando.carro;

//Ligar(Usa sistema elétrico)
//AjustarIntensidade (Agora avisa no painel a intensidade que está sendo utilizada)
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

    public void Ligar(SistemaEletrico eletrico) {
        if (eletrico.verificarBateria() == false) {
            System.out.println("Sistema elétrico falhando.");
        } else {
            if (estado == true) {
                System.out.println("Luzes já estão ligadas");
            } else {
                estado = true;
                System.out.println("Luzes Ligada");
            }
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

    // int diferente de 1 e 2 = luz de posição. 1 = luz baixa, 2 = luz alta
    public void AjustarIntensidade(int novaIntensidade, Painel painel) {
        this.intensidade = novaIntensidade;
        if (intensidade == 1) {
            painel.atualizarInformações("Luz baixa ligada");
        } else if (intensidade == 2) {
            painel.atualizarInformações("Luz alta ligada");
        } else {
            painel.atualizarInformações("Luz de posição ligada");
        }
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
