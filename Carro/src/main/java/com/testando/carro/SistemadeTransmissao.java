
package com.testando.carro;

//trocaRe (Troca a marcha para ré e acende a luz de ré)
//trocarMarcha (Agora mostra a marcha atual no display)
public class SistemadeTransmissao {
    private String tipo;
    private int numeroDeMarchas, marchaAtual = 0;

    public int getMarchaAtual() {
        return marchaAtual;
    }

    public void setMarchaAtual(int marchaAtual) {
        this.marchaAtual = marchaAtual;
    }
    private String material;
    private String marca;
    private boolean estado;

    public SistemadeTransmissao(String tipo, int numeroDeMarchas, String material, String marca, boolean estado) {
        this.tipo = tipo;
        this.numeroDeMarchas = numeroDeMarchas;
        this.material = material;
        this.marca = marca;
        this.estado = estado;
    }

    public void trocarRe(Luzes luz, SistemaEletrico eletrico, Painel painel) {
        marchaAtual = -1;
        painel.atualizarInformações("Marcha Re");
        luz.Ligar(eletrico); 
    }

    public void aumentarMarcha(Painel painel) {
        if(marchaAtual == -1){
            marchaAtual = 1;
        }
        else if (marchaAtual < numeroDeMarchas) {
            marchaAtual++;
            painel.atualizarInformações("Marcha " + marchaAtual);
        } else {
            painel.atualizarInformações("Não é possível aumentar mais!");
        }
    }
    
    public void reduzirMarcha(Painel painel) {
        if (marchaAtual > 0) {
            marchaAtual--;
            painel.atualizarInformações("Marcha " + marchaAtual);
        } else {
            painel.atualizarInformações("Não é possível reduzir mais!");
        }
    }

    public boolean verificarEstado() {
        return estado;
    }

    public void substituirCaixadeMarcha() {
        if (estado == true) {
            System.out.println("A caixa de marcha está boa, não precisa substituir");
        } else if (estado == false) {
            System.out.println("Trocando a caixa de marcha por uma nova.");
            estado = true;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroDeMarchas() {
        return numeroDeMarchas;
    }

    public void setNumeroDeMarchas(int numeroDeMarchas) {
        this.numeroDeMarchas = numeroDeMarchas;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
