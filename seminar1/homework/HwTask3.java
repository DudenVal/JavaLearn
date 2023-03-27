package seminar1.homework;

import java.util.Scanner;

public class HwTask3 {
    public static void calculator() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double firstNumber = iScanner.nextInt();
        System.out.println("Введите оператор(-, +, *, /): ");
        char simbol = iScanner.next().charAt(0);
        System.out.println("Введите второе число: ");
        double secondNumber = iScanner.nextInt();
        iScanner.close();

        if (simbol == '+') {
            System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        } else if (simbol == '-') {
            System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        } else if (simbol == '*') {
            System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        } else if (simbol == '/' && secondNumber == 0.0) {
            System.out.println("На ноль делить нельзя!");
        } else {
            System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
        }
    }
}
