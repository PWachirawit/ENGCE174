package Lab1;

import java.util.Scanner;

public class Lab1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int N = sc.nextInt();

        int[] productIDs = new int[N];
        int[] productQty = new int[N];

        System.out.println("Enter Product data:");
        for (int i = 0; i < N; i++) {
            System.out.print("Product ID: " + (i + 1) + ": ");
            productIDs[i] = sc.nextInt();

            System.out.print("Quantity: " + (i + 1) + ": ");
            productQty[i] = sc.nextInt();
        }

        System.out.println("\nEnter Product ID to search: ");
        int searchID = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < N; i++) {
            if (productIDs[i] == searchID) {
                System.out.println("Product ID: " + productIDs[i] + ", Quantity: " + productQty[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product ID " + searchID + " not found.");
        }

        sc.close();
    }
}