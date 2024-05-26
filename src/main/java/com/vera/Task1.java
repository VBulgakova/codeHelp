package com.vera;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число (показатель степени): ");
        double exponent = scanner.nextDouble();

        System.out.print("Введите второе число (основание степени): ");
        double base = scanner.nextDouble();

        double result = Math.pow(base, exponent);

        System.out.println(base + " в степени " + exponent + " равно " + result);
    }
}
