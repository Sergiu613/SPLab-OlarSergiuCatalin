package com.example.splab;

public class AlignRight implements AlignStrategy {
    @Override
    public void render(String text) {
        int lineWidth = 80;
        int padding = lineWidth - text.length();

        if (padding > 0) {
            // Adăugăm spațiile calculate înainte de text
            System.out.println(" ".repeat(padding) + text);
        } else {
            System.out.println(text);
        }
    }
}