package main.java.com.example;

public class VerificadorAcabou {
    public static boolean parou(Jogador jogador) {
        return jogador.parou() || jogador.getPontos() > 21;
    }
}
