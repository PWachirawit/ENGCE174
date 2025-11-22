package Lab1;

import java.util.Scanner;

public class Lab1_10 {
    public static double calcuateAerea(double width, double height) {
        return width * height;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        double width = scanner.nextDouble();

        System.out.println("Enter height: ");
        double height = scanner.nextDouble();

        double area = calcuateAerea(width, height);

        System.out.println("Area = " + area);

        scanner.close();
    }

}
