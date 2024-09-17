package com.testando.carro;

/*verificarEstado (avisar no painel se a suspensão não está boa)
  substituir (verifica se o pneu foi removido antes de trocar a suspensão)*/
/**
 *
 * @author IFSul
 */
public class Suspensao {
    private String tipo, material, marca;
    private double altura;
    private int rigidez;
    private boolean estado;

    public Suspensao(String tipo, String material, String marca, double altura, int rigidez, boolean estado) {
        this.tipo = tipo;
        this.material = material;
        this.marca = marca;
        this.altura = altura;
        this.rigidez = rigidez;
        this.estado = estado;
    }

    public boolean verificarEstado(Painel painel) {
        if (!estado) {
            painel.atualizarInformações("Troque a suspensão imediatamente");
        }
        return estado;
    }

    public void substituir(String tipo, String material, String marca, double altura, int rigidez, boolean estado,
            Pneus pneu) {
        if (pneu.isRemovido()) {
            this.tipo = tipo;
            this.material = material;
            this.marca = marca;
            this.altura = altura;
            this.rigidez = rigidez;
            this.estado = estado;
        }
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getAltura() {
        return altura;
    }

    public void ajustarAltura(double altura) {
        this.altura = altura;
    }

    public int getRigidez() {
        return rigidez;
    }

    public void setRigidez(int rigidez) {
        this.rigidez = rigidez;
    }

}
