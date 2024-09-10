
package com.testando.carro;

/**
 *
 * @author Abner
 */
public class Carro {

    private String modelo, cor, placa;
    private int ano;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    private double quilometragem;

    public double getQuilometragem() {
        return quilometragem;
    }

    public void ligarCarro() {
        // TODO Integrar com motor e outros componentes
    }

    public void desligarCarro() {
        // TODO Integrar com motor e outros componentes
    }

    public void atualizarQuilometragem(double novaQuilometragem) {
        this.quilometragem = novaQuilometragem;
    }

    public static void main(String[] args) {
        // Criar instâncias das classes envolvidas
        Carro carro = new Carro();
        Motor motor = new Motor();
        Transmissao transmissao = new Transmissao();
        SistemaEletrico sistemaEletrico = new SistemaEletrico();
        Painel painel = new Painel("Eletronico", "ligado", "Toshiba", false, false);

        // Realizar as ações de ligar o motor, ativar a transmissão e o sistema elétrico
        motor.ligarMotor();
        transmissao.aumentarMarcha();
        sistemaEletrico.ativarParteEletrica();

        // Exibir o status no painel
        String status = painel.getDisplay();
        System.out.println("Status do painel:\n" + status);
    }
}
