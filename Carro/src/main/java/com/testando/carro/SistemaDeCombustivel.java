package com.testando.carro;

// integração(PainelAtualizações/Abastecer) //
public class SistemaDeCombustivel {
    private String tipoDeCombustivel;
    private double capacidade;
    private double nivelDeCombustivel;
    private String marca;
    private boolean estado;

    public SistemaDeCombustivel(String tipoDeCombustivel, double capacidade, double nivelDeCombustivel, String marca,
            boolean estado) {
        this.tipoDeCombustivel = tipoDeCombustivel;
        this.capacidade = capacidade;
        this.nivelDeCombustivel = nivelDeCombustivel;
        this.marca = marca;
        this.estado = estado;
    }

    public void verificarNivel(Painel painel) {
        if (nivelDeCombustivel == 0) {
            painel.atualizarInformações("Carro sem gasolina.");
        } else if (nivelDeCombustivel > 0 && nivelDeCombustivel <= 3) {
            painel.atualizarInformações("Nível do combustivel baixo.");
        } else if (nivelDeCombustivel > 3 && nivelDeCombustivel <= 10) {
            painel.atualizarInformações("Nível do combustivel médio");
        } else if (nivelDeCombustivel > 10) {
            painel.atualizarInformações("Nível do combustivel Alto");
        }
    }

    public void Abastecer(double quantidade, Motor motor) {
        if (!motor.verificarEstado()) {
            this.nivelDeCombustivel = quantidade;
        }
    }

    public void SubstituirTanque(double alterarCapacidade) {
        this.capacidade = alterarCapacidade;
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public double getNivelDeCombustivel() {
        return nivelDeCombustivel;
    }

    public void setNivelDeCombustivel(double nivelDeCombustivel) {
        this.nivelDeCombustivel = nivelDeCombustivel;
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
