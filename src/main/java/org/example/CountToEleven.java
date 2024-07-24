package org.example;

import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Enter a number less than 11 ");
        number = scanner.nextInt();

        while (number >= 11) {
            System.out.print("Please enter a number less than 11: ");
            number = scanner.nextInt();
        }

        System.out.println("Counting from " + number + " to 11:");

        while (number <= 11) {
            System.out.println(number);
            number++;
        }

        scanner.close();
    }
}
