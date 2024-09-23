package com.example.sauloday6lab6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(java.time.LocalDate.now());

        Scanner scanner = new Scanner(System.in);
        String greet = scanner.nextLine();

        System.out.println("Hello " + greet);

        System.out.println("NEW CHANGES IN FEATURE-ENHANCE-GREETING");

        System.out.println("NEW CHANGES IN FEATURE-ENHANCE-GREETING 2");

        System.out.println("NEW CHANGES IN FEATURE-ENHANCE-GREETING 3");
    }
}