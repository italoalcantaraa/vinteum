package main.java.com.example;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private int pontos = 0;
    private List<Carta> cartas = new ArrayList<>();
    private boolean parou;

    public void receberCarta(Carta carta) {
        pontos = +carta.getNumero();
        cartas.add(carta);
    }

    public void parar() {
        parou = !parou;
    }

    public int getPontos() {
        return pontos;
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public boolean parou() {
        return parou;
    }
}
