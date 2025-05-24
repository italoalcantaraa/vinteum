package com.example;

public class Jogo {
    protected Monte monte = new Monte();
    protected Jogador jogador = new Jogador();
    protected Computador computador = new Computador();

    public Jogo() {
        monte.embaralhar();
    }

    public Carta distribuiCartaParaJogador(Jogador jogadorOuMaquina) {
        if (jogadorOuMaquina.parou())
            return null;

        Carta cartaVirada = monte.virar();
        jogadorOuMaquina.receberCarta(cartaVirada);

        return cartaVirada;
    }

    public boolean acabou() {
        return VerificadorAcabou.acabou(jogador, computador);
    }

    public String resultado() {
        ObserverResultado observerResultado = new ObserverResultado();
        int resultado = observerResultado.calcularResultado(jogador, computador);

        return VerificadorResultado.verificar(resultado);
    }

    public Jogador getJogador() {
        return jogador;
    }

    public Computador getComputador() {
        return computador;
    }

    
}
