/**
 * Задание 1
 * с использованием DO WHILE
 */
package Task_C;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ваше число: ");
            int num = scanner.nextInt();
            if (num < 1) num = 1;
            if (num > 9) num = 9;
            int row = 0;
            int i = 0;
            do {
                // Отрисовка пробелов
                int j_1 = 0;
                do {
                    System.out.print("  ");
                    j_1++;
                } while (j_1 < num - i);
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
                do {
                    System.out.print(num - j_2);
                    System.out.print(" ");
                    j_2++;
                } while (j_2 < row);
                // Отрисовка внутреннего слоя справа
                if (row != 1) {
                    int j_3 = row;
                    do {
                        System.out.print(num - j_3);
                        System.out.print(" ");
                        j_3--;
                    } while (j_3 >= 1);
                }
                // Отрисовка внешнего слоя справа
                System.out.print(num);
                System.out.print(" ");
                System.out.println();
                row++;
                i++;
            } while (i < num);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка! Введён неподдерживаемый символ или превышен размер числа!");
            main(args);
        }
    }
}
