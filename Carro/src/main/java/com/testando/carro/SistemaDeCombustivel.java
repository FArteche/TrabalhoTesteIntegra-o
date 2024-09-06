package com.testando.carro;

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

    public void verificarNivel() {
        if (nivelDeCombustivel == 0) {
            System.out.println("Carro sem gasolina.");
        } else if (nivelDeCombustivel > 0 && nivelDeCombustivel <= 3) {
            System.out.println("Nível do combustivel baixo.");
        } else if (nivelDeCombustivel > 3 && nivelDeCombustivel <= 10) {
            System.out.println("Nível do combustivel médio");
        } else if (nivelDeCombustivel > 10) {
            System.out.println("Nível do combustivel Alto");
        }
    }

    public void Abastecer(double quantidade) {
        this.nivelDeCombustivel = quantidade;
    }

    public void SubstituirTanque(double alterarCapacidade) {
        this.capacidade = alterarCapacidade;
    }

}
