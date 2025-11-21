package Lab1;

import java.util.Scanner;

public class Lab1_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = scanner.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= N) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();
            sum += number;
            i++;
        }

        System.out.println("Sum = " + sum);

        scanner.close();
    }
}
