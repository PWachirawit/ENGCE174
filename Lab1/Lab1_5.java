package Lab1;

import java.util.Scanner;

public class Lab1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter menu number (1-4): ");
        int menuNumber = scanner.nextInt();

        switch (menuNumber) {
            case 1:
                System.out.println("Americano");
                break;
            case 2:
                System.out.println("Latte");
                break;
            case 3:
                System.out.println("Espresso");
                break;
            case 4:
                System.out.println("Mocha");
                break;
            default:
                System.out.println("Invalid menu");
                break;
        }

        scanner.close();
    }
}
