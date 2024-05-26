package com.vera;

import java.util.Random;

public class Task12 {
    public static void main(String[] args) {
        Random random = new Random();

        int randomNumber = random.nextInt(12) + 11;

        System.out.println("Случайное число от 11 до 22: " + randomNumber);
    }
}
