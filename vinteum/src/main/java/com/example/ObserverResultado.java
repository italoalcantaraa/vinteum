package main.java.com.example;

public class ObserverResultado implements Observer {
    @Override
    public int calcularResultado(Jogador jogador, Computador computador) {
        return jogador.getPontos() - computador.getPontos();
    }
}
