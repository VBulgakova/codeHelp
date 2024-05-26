package com.vera;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число N (от 1 до 26): ");
        int n = scanner.nextInt();

        if (n < 1 || n > 26) {
            System.out.println("Ошибка: число должно быть в диапазоне от 1 до 26.");
        } else {
            char letter = (char) ('A' + (n - 1));
            System.out.println("Буква английского алфавита под номером " + n + ": " + letter);
        }
    }

}
