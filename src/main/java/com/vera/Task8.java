package com.vera;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double number1 = scanner.nextDouble();

        System.out.print("Введите первый оператор (+, -, *, /): ");
        char operator1 = scanner.next().charAt(0);

        System.out.print("Введите второе число: ");
        double number2 = scanner.nextDouble();

        System.out.print("Введите второй оператор (+, -, *, /): ");
        char operator2 = scanner.next().charAt(0);

        System.out.print("Введите третье число: ");
        double number3 = scanner.nextDouble();

        double intermediateResult;

        if (operator1 == '*' || operator1 == '/') {
            intermediateResult = calculate(number1, number2, operator1);
            intermediateResult = calculate(intermediateResult, number3, operator2);
        } else if (operator2 == '*' || operator2 == '/') {
            intermediateResult = calculate(number2, number3, operator2);
            intermediateResult = calculate(number1, intermediateResult, operator1);
        } else {
            intermediateResult = calculate(number1, number2, operator1);
            intermediateResult = calculate(intermediateResult, number3, operator2);
        }

        // Выводим результат
        System.out.println("Результат: " + intermediateResult);
    }

    // Метод для выполнения вычислений
    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Ошибка: деление на ноль.");
                    return 0;
                }
            default:
                System.out.println("Ошибка: неверный оператор.");
                return 0;
        }
    }
}
