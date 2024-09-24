
package com.testando.carro;

/**
 *
 * @author Abner
 */
public class Carro {

    private String modelo, cor, placa;
    private int ano;
    private boolean ligado;

    public String getModelo() {
        return modelo;
    }

    public boolean isLigado() {
        return ligado;
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

    public void ligarCarro(Motor motor, Painel painel, SistemaDeDirecao direcao, SistemadeTransmissao transmissao,
            SistemaEletrico eletrico, SistemaDeCombustivel combustivel) {
        eletrico.ativarParteEletrica();
        motor.ligarMotor(eletrico, combustivel);
        painel.ligarDisplay(eletrico);
        direcao.LiberarDirecao(motor);
        if (motor.isEstado() && painel.isEstado() && direcao.getEstado() && transmissao.verificarEstado()) {
            ligado = true;
        }
    }

    public void desligarCarro(Motor motor, Painel painel, SistemaDeDirecao direcao, SistemadeTransmissao transmissao,
            SistemaEletrico eletrico, SistemaDeCombustivel combustivel) {
        ligado = false;
        eletrico.ativarParteEletrica();
        motor.desligarMotor();
        painel.desligarDisplay();
        direcao.TrancarDirecao(motor);
    }

    public void atualizarQuilometragem(double novaQuilometragem) {
        this.quilometragem = novaQuilometragem;
    }

    public static void main(String[] args) {
        // Criar instâncias das classes envolvidas
        Carro carro = new Carro();
        Motor motor = new Motor("Combustão", 200, 1.4, "Volksvagem", true);
        SistemadeTransmissao transmissao = new SistemadeTransmissao("Manual", 6, "Eixo", "MItsubishi", true);
        SistemaEletrico sistemaEletrico = new SistemaEletrico(12.0, 1.75, "convencional de chumbo-ácido", true, "Moura");
        Painel painel = new Painel("Eletronico", "ligado", "Toshiba", false, false);
        Suspensao suspensao = new Suspensao("Mola", "Ferro", "Esparco", 0, 0, false);

        // Realizar as ações de ligar o motor, ativar a transmissão e o sistema elétrico
        //motor.ligarMotor();
        //transmissao.aumentarMarcha();
        sistemaEletrico.ativarParteEletrica();

        // Exibir o status no painel
        String status = painel.getDisplay();
        System.out.println("Status do painel:\n" + status);
    }
}
