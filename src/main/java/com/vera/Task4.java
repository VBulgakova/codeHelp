package com.vera;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String firstString = scanner.nextLine();

        System.out.print("Введите вторую строку: ");
        String secondString = scanner.nextLine();

        int length1 = firstString.length();
        int length2 = secondString.length();

        int difference = Math.abs(length1 - length2);

        // Выводим результат
        System.out.println("Длина первой строки: " + length1);
        System.out.println("Длина второй строки: " + length2);
        System.out.println("Разница в длине строк: " + difference);
    }
}
