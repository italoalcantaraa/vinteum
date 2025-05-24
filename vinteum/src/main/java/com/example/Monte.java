package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Monte {
    private List<Carta> cartas = new ArrayList<>();

    public Monte() {
        for (byte count = 1; count <= 4; count++) {
            for (byte count2 = 1; count2 <= 10; count2++) {
                cartas.add(new Carta(count2, Naipe.values()[count - 1]));
            }
        }
    }

    public void embaralhar() {
        Collections.shuffle(cartas);
    }

    public Carta virar() {
        return cartas.remove(0);
    }
}
