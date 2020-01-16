/**
 * Задание 1
 * с использованием DO WHILE
 */
package Task_B;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        boolean isPalindrome;
        int userNumber = getUserNumber();
        int reverseNumber = getReverseNumber(userNumber);

        isPalindrome = isPalindrome(userNumber, reverseNumber);

        System.out.println(isPalindrome ? userNumber + " - полиндром " : userNumber + " - не полиндром");
    }


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

    private static int getReverseNumber(int number) {
        int reverseNumber = 0;
        do {
            reverseNumber *= 10;
            reverseNumber += number % 10;
            number /= 10;
            System.out.println(number);
        } while (number != 0);
        return reverseNumber;
    }

    public static boolean isPalindrome(int leftNumberHalf, int rightNumberHalf) {
        return leftNumberHalf == rightNumberHalf;
    }
}
