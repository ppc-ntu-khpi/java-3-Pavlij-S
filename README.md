# Практична робота "Масиви, вирази, керування виконанням програми"

Цей репозиторій містить стартовий код для виконання практичної роботи, який містить заготовки двох класів, що демонструють структуру проекту для виконання завдань на масиви, керуючі конструкції та вирази.

---

## 📘 Обране завдання
**Завдання 13:**  Перевірте чи є задане число [числом Армстронга]

### 🔑 Суть методу

Метод Exercise.Calculate(int number) реалізує алгоритм перевірки числа Армстронга.

Число Армстронга — це таке натуральне число, яке дорівнює сумі своїх цифр, піднесених до степеня, що дорівнює кількості цифр у цьому числі.

**Алгоритм роботи методу:**

- Отримати кількість цифр у заданому числі.

- Розкласти число на цифри та для кожної цифри обчислити її степінь, рівний кількості цифр.

- Просумувати результати.

- Порівняти суму з початковим числом. Якщо вони рівні — число є Армстронга, і метод повертає true, інакше — false.
---

## ⚙️ Реалізація
Метод `Exercise.Calculate(int number)` приймає ціле число і перевіряє, чи є воно числом Армстронга.


```java
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

```
Клас `TestResult` виводить результат:
```java
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

```
## 🧩 Приклад запуску

Вхідні дані:
```
Введіть число: 56
```
Результат:
```
56 не є числом Армстронга.
```
<img width="805" height="69" alt="image" src="https://github.com/user-attachments/assets/c5e4cb70-a6ab-4115-bc24-2521dd14fbc6" />

