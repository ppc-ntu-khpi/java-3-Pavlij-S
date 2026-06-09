package test;

import domain.Exercise;
import java.util.Scanner;

public class TestResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число: ");
        int R = scanner.nextInt();

        if (Exercise.Calculate(R)) {
            System.out.println(R + " є числом Армстронга.");
        } else {
            System.out.println(R + " не є числом Армстронга.");
        }

        scanner.close();
    }
}
