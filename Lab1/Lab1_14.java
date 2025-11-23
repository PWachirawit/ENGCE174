package Lab1;

import java.util.Scanner;

public class Lab1_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter R (rows): ");
        int R = scanner.nextInt();

        System.out.print("Enter C (columns): ");
        int C = scanner.nextInt();

        char[][] map = new char[R][C];

        System.out.println("Enter map (* for mine, . for empty):");

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                map[i][j] = scanner.next().charAt(0);
            }
        }

        System.out.print("Enter target row: ");
        int targetR = scanner.nextInt();

        System.out.print("Enter target column: ");
        int targetC = scanner.nextInt();

        if (map[targetR][targetC] == '*') {
            System.out.println("Mine");
            return;
        }

        int count = 0;

        int[] dR = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int[] dC = { -1, 0, 1, -1, 1, -1, 0, 1 };

        for (int i = 0; i < 8; i++) {
            int newR = targetR + dR[i];
            int newC = targetC + dC[i];

            if (newR >= 0 && newR < R && newC >= 0 && newC < C) {
                if (map[newR][newC] == '*') {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
