package domain;

public class Exercise {
    // Метод перевіряє, чи є число Армстронга
    public static boolean Calculate(int number) {
        int original = number;
        int digits = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        return sum == original;
    }
}
