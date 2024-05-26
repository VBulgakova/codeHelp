package com.vera;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число (основание первой степени): ");
        double number1 = scanner.nextDouble();

        System.out.print("Введите второе число (показатель первой степени): ");
        double number2 = scanner.nextDouble();

        System.out.print("Введите третье число (показатель второй степени): ");
        double number3 = scanner.nextDouble();

        double intermediateResult = Math.pow(number1, number2);

        double finalResult = Math.pow(intermediateResult, number3);

        // Выводим результат
        System.out.println(number1 + " в степени " + number2 + " равно " + intermediateResult);
        System.out.println(intermediateResult + " в степени " + number3 + " равно " + finalResult);
    }
}
