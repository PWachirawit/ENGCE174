package Lab1;

import java.util.Scanner;

public class Lab1_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = scanner.nextInt();

        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        for (int i = 1; i < N; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum value = " + max);

        scanner.close();
    }
}