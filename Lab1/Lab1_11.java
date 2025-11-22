package Lab1;

import java.util.Scanner;

public class Lab1_11 {

    static int sum(int[] a) {
        int s = 0;
        for (int v : a) {
            s += v;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("N must be a positive integer.");
            return;
        }

        int[] arr = new int[N];

        System.out.println("Enter " + N + " integers:");
        for (int i = 0; i < N; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int total = sum(arr);

        System.out.println("\n--- Results ---");
        System.out.print("The entered numbers are: ");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + (i < N - 1 ? ", " : ""));
        }

        System.out.println("\nSum of all numbers: " + total);

        sc.close();
    }
}
