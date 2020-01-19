/**
 * Задание 1
 * с использованием DO WHILE
 */
package Task_B;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_1 {
    /**
     * Определет является ли число палиндромом
     * @param args
     */
    public static void main(String[] args) {
        boolean isPalindrome;
        int userNumber = getUserNumber();
        int reverseNumber = getReverseNumber(userNumber);

        isPalindrome = isPalindrome(userNumber, reverseNumber);

        System.out.println(isPalindrome ? userNumber + " - полиндром " : userNumber + " - не полиндром");
    }

    /**
     * Возвращает число пользователя
     * @return int
     */
    public static int getUserNumber() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Выше число: ");
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка! Введён неподдерживаемый символ или превышен размер числа!");
            return getUserNumber();
        }
    }

    /**
     * Принимает число, которое надо перевернуть
     * @param number
     * @return int
     */
    private static int getReverseNumber(int number) {
        int reverseNumber = 0;
        do {
            reverseNumber *= 10;
            reverseNumber += number % 10;
            number /= 10;
        } while (number != 0);
        return reverseNumber;
    }

    /**
     * Проверяет число на полиндромность
     * @param leftNumberHalf
     * @param rightNumberHalf
     * @return bool
     */
    public static boolean isPalindrome(int leftNumberHalf, int rightNumberHalf) {
        return leftNumberHalf == rightNumberHalf;
    }
}
