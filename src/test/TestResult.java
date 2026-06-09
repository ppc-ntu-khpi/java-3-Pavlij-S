package test;

import domain.Exercise;

public class TestResult {
    public static void main(String[] args) {
        int R = 153; // приклад числа для перевірки
        if (Exercise.Calculate(R)) {
            System.out.println(R + " є числом Армстронга.");
        } else {
            System.out.println(R + " не є числом Армстронга.");
        }
    }
}
