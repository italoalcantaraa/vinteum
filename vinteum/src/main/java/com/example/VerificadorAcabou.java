package com.example;

public class VerificadorAcabou {
    public static boolean acabou(Jogador... jogador) {
        for (Jogador j : jogador) {

            if (j.parou() || j.getPontos() > 21)
                return true;

        }
        return false;
    }
}
