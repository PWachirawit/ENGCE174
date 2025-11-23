package Lab1;

import java.util.Scanner;

public class Lab1_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter R (rows): ");
        int R = sc.nextInt();

        System.out.print("Enter C (columns): ");
        int C = sc.nextInt();

        int[][] matrix = new int[R][C];

        System.out.println("Enter server status (0 = Off, 1 = On):");

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int onCount = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (matrix[i][j] == 1) {
                    onCount++;
                }
            }
        }

        System.out.println("Number of servers that are ON: " + onCount);

    }
}
