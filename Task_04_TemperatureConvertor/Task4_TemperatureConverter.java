package Task_04_TemperatureConvertor;

import java.util.Scanner;

public class Task4_TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter choice: ");
        choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter Celsius: ");
            double c = sc.nextDouble();
            double f = (c * 9 / 5) + 32;
            System.out.println("Fahrenheit: " + f);
        } else if (choice == 2) {
            System.out.print("Enter Fahrenheit: ");
            double f = sc.nextDouble();
            double c = (f - 32) * 5 / 9;
            System.out.println("Celsius: " + c);
        } else {
            System.out.println("Invalid choice");
        }
        sc.close();
    }
}



