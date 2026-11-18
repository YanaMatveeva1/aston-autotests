import java.util.Arrays;

public class Lesson2Homework {

    public static void main(String[] args) {
        System.out.println("--- Задание 1 ---");
        printThreeWords();

        System.out.println("--- Задание 2 ---");
        checkSumSign();

        System.out.println("--- Задание 3 ---");
        printColor();

        System.out.println("--- Задание 4 ---");
        compareNumbers();

        System.out.println("--- Задание 5 ---");
        System.out.println(isSumInRange(5, 7));   // 12 -> true
        System.out.println(isSumInRange(15, 10)); // 25 -> false

        System.out.println("--- Задание 6 ---");
        printNumberSign(42);
        printNumberSign(0);
        printNumberSign(-7);

        System.out.println("--- Задание 7 ---");
        System.out.println(isNegative(-3)); // true
        System.out.println(isNegative(0));  // false

        System.out.println("--- Задание 8 ---");
        printTextRepeatedly("Привет!", 3);

        System.out.println("--- Задание 9 ---");
        System.out.println(isLeapYear(2024)); // true
        System.out.println(isLeapYear(1900)); // false
        System.out.println(isLeapYear(2000)); // true
        System.out.println(isLeapYear(2023)); // false

        System.out.println("--- Задание 10 ---");
        invertZerosAndOnes();

        System.out.println("--- Задание 11 ---");
        fillArrayFromOneToHundred();

        System.out.println("--- Задание 12 ---");
        doubleNumbersLessThanSix();

        System.out.println("--- Задание 13 ---");
        fillDiagonalsWithOnes();

        System.out.println("--- Задание 14 ---");
        int[] filledArray = createFilledArray(5, 7);
        System.out.println(Arrays.toString(filledArray));
    }

    // 1. Печатает три слова в столбец
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // 2. Проверяет, положительная ли сумма двух чисел
    public static void checkSumSign() {
        int a = 5;
        int b = -3;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // 3. Выводит цвет в зависимости от значения
    public static void printColor() {
        int value = 50;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // 4. Сравнивает два числа
    public static void compareNumbers() {
        int a = 10;
        int b = 20;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 5. Проверяет, что сумма двух чисел лежит в пределах от 10 до 20 включительно
    public static boolean isSumInRange(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        return sum >= 10 && sum <= 20;
    }

    // 6. Печатает, положительное число или отрицательное (ноль считаем положительным)
    public static void printNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Число " + number + " положительное");
        } else {
            System.out.println("Число " + number + " отрицательное");
        }
    }

    // 7. Возвращает true, если число отрицательное (ноль считаем положительным)
    public static boolean isNegative(int number) {
        return number < 0;
    }

    // 8. Печатает строку указанное количество раз
    public static void printTextRepeatedly(String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }

    // 9. Проверяет, является ли год високосным
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }

    // 10. Меняет в массиве 0 на 1, а 1 на 0
    public static void invertZerosAndOnes() {
        int[] numbers = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("До:    " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                numbers[i] = 1;
            } else {
                numbers[i] = 0;
            }
        }

        System.out.println("После: " + Arrays.toString(numbers));
    }

    // 11. Заполняет массив длиной 100 числами от 1 до 100
    public static void fillArrayFromOneToHundred() {
        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        System.out.println(Arrays.toString(numbers));
    }

    // 12. Умножает на 2 числа меньше 6
    public static void doubleNumbersLessThanSix() {
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("До:    " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 6) {
                numbers[i] = numbers[i] * 2;
            }
        }

        System.out.println("После: " + Arrays.toString(numbers));
    }

    // 13. Заполняет обе диагонали квадратного массива единицами
    public static void fillDiagonalsWithOnes() {
        int size = 5;
        int[][] square = new int[size][size];

        for (int i = 0; i < size; i++) {
            square[i][i] = 1;            // главная диагональ: [0][0], [1][1], ...
            square[i][size - 1 - i] = 1; // побочная диагональ: [0][4], [1][3], ...
        }

        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(square[i]));
        }
    }

    // 14. Создает массив длиной len, где каждая ячейка равна initialValue
    public static int[] createFilledArray(int len, int initialValue) {
        int[] result = new int[len];

        for (int i = 0; i < result.length; i++) {
            result[i] = initialValue;
        }

        return result;
    }
}
