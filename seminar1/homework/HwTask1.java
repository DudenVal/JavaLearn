package seminar1.homework;

import java.util.Scanner;

// Задача 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!.
public class HwTask1 {

    public static void searchNumber() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", giveMeNumber(i));
        System.out.printf("Факториал числа: %d\n", factorialNumber(i));
        iScanner.close();
    }

    public static int giveMeNumber(int number) {
        return (number * (number + 1)) / 2;
    }

    public static int factorialNumber(int FacNumber) {
        int result = 1;
        for (int i = 1; i <= FacNumber; i++) {
            result *= i;
        }
        return result;
    }

}
