package Lab1;

import java.util.Scanner;

public class Lab1_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter multiplication number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 12; i++) {
            int result = number * i;
            System.out.printf("%d x %d = %d\n", number, i, result);
        }

        scanner.close();
    }
}