package com.vera;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число (основание первой степени): ");
        double number1 = scanner.nextDouble();

        System.out.print("Введите второе число (показатель первой степени): ");
        double number2 = scanner.nextDouble();

        System.out.print("Введите третье число (показатель второй степени): ");
        double number3 = scanner.nextDouble();

        double finalResult = Math.pow(Math.pow(number1, number2), number3);

        // Выводим результат
        System.out.println(number1 + " в степени " + number2 + " равно " + Math.pow(number1, number2));
        System.out.println("Результат возведения в степень " + number3 + " равен " + finalResult);
    }
}
