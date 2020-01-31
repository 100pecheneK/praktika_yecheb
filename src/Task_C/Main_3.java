/**
 * Задание 3
 * с использованием FOR
 */
package Task_C;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_3 {
    /**
     * Отрисовывает узор "пирамидка" из числа пользователя
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ваше число: ");
            int num = scanner.nextInt();
            if (num < 1) num = 1;
            if (num > 9) num = 9;
            int row = 0;
            for (int i = 0; i < num; i++) {
                // Отрисовка пробелов
                for (int j = 0; j < num - i; j++) {
                    System.out.print("  ");
                }
                // Отрисовка верхушки
                if (row == 0) {
                    System.out.println(num);
                    row++;
                    continue;
                }
                // Отрисовка внешнего слоя слева
                System.out.print(num);
                System.out.print(" ");
                // Отрисовка внутреннего слоя слева
                for (int j = 1; j < row; j++) {
                    System.out.print(num - j);
                    System.out.print(" ");
                }
                // Отрисовка внутреннего слоя справа
                for (int j = row; j >= 1; j--) {
                    System.out.print(num - j);
                    System.out.print(" ");
                }
                // Отрисовка внешнего слоя справа
                System.out.print(num);
                System.out.print(" ");
                System.out.println();
                row++;
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка! Введён неподдерживаемый символ или превышен размер числа!");
            main(args);
        }
    }
}
