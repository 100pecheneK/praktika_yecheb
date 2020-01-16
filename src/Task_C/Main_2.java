/**
 * Задание 2
 * с использованием WHILE
 */
package Task_C;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ваше число: ");
            int num = scanner.nextInt();
            if (num < 1) num = 1;
            if (num > 9) num = 9;
            int row = 0;
            int i = 0;
            while (i < num) {
                // Отрисовка пробелов
                int j_1 = 0;
                while (j_1 < num - i) {
                    System.out.print("  ");
                    j_1++;
                }
                // Отрисовка верхушки
                if (row == 0) {
                    System.out.println(num);
                    row++;
                    i++;
                    continue;
                }
                // Отрисовка внешнего слоя слева
                System.out.print(num);
                System.out.print(" ");
                // Отрисовка внутреннего слоя слева
                int j_2 = 1;
                while (j_2 < row) {
                    System.out.print(num - j_2);
                    System.out.print(" ");
                    j_2++;
                }
                // Отрисовка внутреннего слоя справа
                int j_3 = row;
                while (j_3 >= 1) {
                    System.out.print(num - j_3);
                    System.out.print(" ");
                    j_3--;
                }
                // Отрисовка внешнего слоя справа
                System.out.print(num);
                System.out.print(" ");

                System.out.println();
                row++;
                i++;
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка! Введён неподдерживаемый символ или превышен размер числа!");
            main(args);
        }
    }
}
