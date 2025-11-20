package Lab1;

import java.util.Scanner;

public class Lab1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        double width = scanner.nextDouble();

        System.out.println("Enter height: ");
        double height = scanner.nextDouble();

        double area = width * height;

        System.out.println("The area is " + area);

    }
}