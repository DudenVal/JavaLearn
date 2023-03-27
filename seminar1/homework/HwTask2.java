package seminar1.homework;

import java.util.Scanner;

public class HwTask2 {

    public static void searchEasyNumber() {
        
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите положительное число: ");
        int input = iScanner.nextInt();
        iScanner.close();
        boolean number = true;
        for (int j = 2; j <= input; j++) {
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    number = false;
                    break;
                }
            }
            if (number) System.out.println(j);
            else number = true;
        }
    }
}