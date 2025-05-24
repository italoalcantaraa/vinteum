package com.example;

public class VerificadorResultado {
    public static String verificar(int resultado) {
        if (resultado > 0)
            return "Você ganhou";

        if (resultado < 0)
            return "Você perdeu";

        return "Empate";
    }
}
