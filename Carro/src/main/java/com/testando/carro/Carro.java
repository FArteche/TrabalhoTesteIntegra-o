
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
        eletrico.desativarParteEletrica();
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
        Bancos banco = new Bancos(5, "Pano", "Cinza queimado pelo sol", "Velho", "Reclinado", 1.5);
        Freios freio = new Freios("Disco", "Aço", "xing ling", 160, 9.9);
        Luzes farol = new Luzes("LED", 1000000, "Branco", false, "Modelo de chinelão");
        Luzes luzRe = new Luzes("LED", 10, "Branco", false, "Modelo de chinelão");
        Luzes luzInterior = new Luzes("LED", 10, "Branco", false, "Modelo de chinelão");
        Luzes luzFreio = new Luzes("LED", 10, "Vermelho", false, "Modelo de chinelão");
        Pneus pneu1 = new Pneus("20", "Pneu careca, já ta na câmara", "goodyear?", "Perigo Iminente", 23, 15, false);
        Pneus pneu2 = new Pneus("20", "Pneu careca, já ta na câmara", "goodyear?", "Perigo Iminente", 25, 15, false);
        Pneus pneu3 = new Pneus("20", "Pneu careca, já ta na câmara", "goodyear?", "Perigo Iminente", 20, 15, false);
        Pneus pneu4 = new Pneus("20", "Pneu careca, já ta na câmara", "goodyear?", "Perigo Iminente", 27, 18, false);
        Portas porta = new Portas(4, "Lata", "Azul desbotado e ferrugem", "Porta?", "fechado");
        SistemaDeDirecao direcao = new SistemaDeDirecao("Mecanica, musulação caseira", false, "Ferro", 0.1, "de fabrica(nao sei como)", false);
        Motor motor = new Motor("Combustão", 200, 1.4, "Volksvagem", true);
        SistemadeTransmissao transmissao = new SistemadeTransmissao("Manual", 6, "Eixo", "MItsubishi", false);
        SistemaEletrico sistemaEletrico = new SistemaEletrico(13.1, 1.75, "convencional de chumbo-ácido", true, "Moura");
        Painel painel = new Painel("Eletronico", "ligado", "Toshiba", false, false);
        Suspensao suspensao = new Suspensao("Mola", "Ferro", "Esparco", 0, 0, false);
        SistemaDeCombustivel combustivel = new SistemaDeCombustivel("Movido a vento", 50, 25, "MarcaX", true);

        // Realizar as ações de ligar o motor, ativar a transmissão e o sistema elétrico
        motor.ligarMotor(sistemaEletrico, combustivel);
        sistemaEletrico.ativarParteEletrica();
        painel.ligarDisplay(sistemaEletrico);

        // Exibir o status no painel
        banco.ajustarAltura(1.5, painel);
        System.out.println("---------------------------------------------------");
        System.out.println("Status do painel:\n" + painel.getDisplay());
        banco.ajustarEncosto("Ereto", painel);
        System.out.println("---------------------------------------------------");
        System.out.println("Status do painel:\n" + painel.getDisplay());
        freio.avisoDesgaste(painel);
        System.out.println("---------------------------------------------------");
        System.out.println("Status do painel:\n" + painel.getDisplay());
        farol.AjustarIntensidade(2, painel);
        System.out.println("---------------------------------------------------");
        System.out.println("Status do painel:\n" + painel.getDisplay());
        pneu1.verificarPressao(painel);
        System.out.println("---------------------------------------------------");
        System.out.println("Status do painel:\n" + painel.getDisplay());
        pneu2.verificarPressao(painel);
        System.out.println("---------------------------------------------------");
        System.out.println("Status do painel:\n" + painel.getDisplay());
        pneu3.verificarPressao(painel);
        System.out.println("---------------------------------------------------");
        System.out.println("Status do painel:\n" + painel.getDisplay());
        pneu4.verificarPressao(painel);
        System.out.println("---------------------------------------------------");
        System.out.println("Status do painel:\n" + painel.getDisplay());
        combustivel.verificarNivel(painel);
        System.out.println("---------------------------------------------------");
        System.out.println("Status do painel:\n" + painel.getDisplay());
        sistemaEletrico.testarSistema(painel);
        System.out.println("---------------------------------------------------");
        System.out.println("Status do painel:\n" + painel.getDisplay());
        transmissao.aumentarMarcha(painel);
        System.out.println("---------------------------------------------------");
        System.out.println("Status do painel:\n" + painel.getDisplay());
        transmissao.aumentarMarcha(painel);
        System.out.println("---------------------------------------------------");
        System.out.println("Status do painel:\n" + painel.getDisplay());
        transmissao.reduzirMarcha(painel);
        System.out.println("---------------------------------------------------");
        System.out.println("Status do painel:\n" + painel.getDisplay());
        transmissao.trocarRe(luzRe, sistemaEletrico, painel);
        System.out.println("---------------------------------------------------");
        System.out.println("Status do painel:\n" + painel.getDisplay());
        suspensao.verificarEstado(painel);
        System.out.println("---------------------------------------------------");
        System.out.println("Status do painel:\n" + painel.getDisplay());
        motor.mostrarEspecificações(painel);
        System.out.println("---------------------------------------------------");
        System.out.println("Status do painel:\n" + painel.getDisplay());
    }
}
