package Lab1;

import java.util.Scanner;

public class Lab1_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = scanner.nextInt();

        int[] numbers = new int[N];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        double average = (double) sum / N;

        System.out.println("Average = " + average);

        scanner.close();
    }

}
