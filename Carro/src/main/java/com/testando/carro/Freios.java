package com.testando.carro;
//frear adicionado (aumenta o desgaste e aciona a luz de freio)
//avisoDesgaste (Mostra mensagem no painel se o desgaste dos freios é alto)
public class Freios {
    private String tipo, material, marca;
    private double tamanho, nivelDeDesgaste;

    public Freios(String tipo, String material, String marca, double tamanho, double nivelDeDesgaste) {
        this.tipo = tipo;
        this.material = material;
        this.marca = marca;
        this.tamanho = tamanho;
        this.nivelDeDesgaste = nivelDeDesgaste;
    }

    public void frear(Luzes luz, SistemaEletrico eletrico){
        nivelDeDesgaste += 0.1;
        luz.Ligar(eletrico);
    }

    public void avisoDesgaste(Painel painel){
        if(nivelDeDesgaste >= 10.00){
            painel.atualizarInformações("Freios desgastados, realize a manutenção");
        }
    }

    public void substituirPastilha() {
        nivelDeDesgaste = 0.0;
    }

    public void ajustarFreio(String tipo, String material, String marca, double tamanho) {
        this.tipo = tipo;
        this.material = material;
        this.marca = marca;
        this.tamanho = tamanho;
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

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double verificarDesgaste() {
        return nivelDeDesgaste;
    }

    public void setNivelDeDesgaste(double nivelDeDesgaste) {
        this.nivelDeDesgaste = nivelDeDesgaste;
    }

}