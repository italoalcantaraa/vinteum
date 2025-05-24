package com.example;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    protected int pontos = 0;
    protected List<Carta> cartas = new ArrayList<>();
    protected boolean parou;

    public void receberCarta(Carta carta) {
        cartas.add(carta);
        pontos += carta.getNumero();
    }

    public void parar() {
        parou = true;
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
