package com.vera;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя три строки
        System.out.print("Введите первую строку: ");
        String firstString = scanner.nextLine();

        System.out.print("Введите вторую строку: ");
        String secondString = scanner.nextLine();

        System.out.print("Введите третью строку: ");
        String thirdString = scanner.nextLine();

        int length1 = firstString.length();
        int length2 = secondString.length();
        int length3 = thirdString.length();

        int minLength = Math.min(length1, Math.min(length2, length3));
        int maxLength = Math.max(length1, Math.max(length2, length3));

        int difference = maxLength - minLength;

        // Выводим результат
        System.out.println("Длина первой строки: " + length1);
        System.out.println("Длина второй строки: " + length2);
        System.out.println("Длина третьей строки: " + length3);
        System.out.println("Разница в длине самой короткой и самой длинной строки: " + difference);
    }
}
