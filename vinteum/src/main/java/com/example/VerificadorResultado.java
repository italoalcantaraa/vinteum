package main.java.com.example;

public class VerificadorResultado {
    public static String verificar(int resultado) {
        if (resultado > 0)
            return "Jogador ganhou";

        if (resultado < 0)
            return "Jogador perdeu";

        return "Empate";
    }
}
