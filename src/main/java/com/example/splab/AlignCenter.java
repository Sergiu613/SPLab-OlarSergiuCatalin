package com.example.splab;

public class AlignCenter implements AlignStrategy {
    @Override
    public void render(String text) {
        int lineWidth = 80;
        int padding = (lineWidth - text.length()) / 2;

        if (padding > 0) {
            // Adăugăm jumătate din spațiile goale înainte de text
            System.out.println(" ".repeat(padding) + text);
        } else {
            System.out.println(text);
        }
    }
}
