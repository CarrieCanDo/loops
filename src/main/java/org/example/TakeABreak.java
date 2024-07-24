package org.example;

import java.util.Scanner;

public class TakeABreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response = "";

        while (!response.equals("yes")) {
            System.out.println("Do you want to take a break?");
            response = scanner.nextLine().trim().toLowerCase();
        }

        System.out.println("Great! Take a break and relax.");
        scanner.close();
    }
}

