package Lab1;

import java.util.Scanner;

public class Lab1_11 {

    public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("N must be a positive integer.");
            scanner.close();
            return;
        }

        int[] numbers = new int[N];
        System.out.println("Enter " + N + " integers:");

        for (int i = 0; i < N; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int totalSum = sumArray(numbers);

        System.out.println("\n--- Results ---");
        System.out.print("The entered numbers are: ");
        for (int i = 0; i < N; i++) {
            System.out.print(numbers[i] + (i < N - 1 ? ", " : ""));
        }

        System.out.println("\nSum of all numbers: " + totalSum);

        scanner.close();
    }
}
