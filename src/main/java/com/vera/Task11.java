package com.vera;

import java.util.Random;

public class Task11 {
    public static void main(String[] args) {
        Random random = new Random();

        int randomIndex = random.nextInt(26);

        char randomLetter = (char) ('A' + randomIndex);

        // Выводим случайную букву
        System.out.println("Случайная буква английского алфавита: " + randomLetter);
    }
}
