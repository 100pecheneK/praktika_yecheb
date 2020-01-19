package Task_A;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    /**
     * Принимает на ввод через System.in количество секунд
     * и выводит оценку, в зависимости от количества секунд
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double time;
        System.out.println("Нормативы:\n" +
                "До 49,0 - оценка 5\n" +
                "До 52,0 - оценка 4\n" +
                "До 56,0 - оценка 3\n" +
                "Более 56,0 - оценка 2");
        System.out.print("За сколько секунд студент пробежал 400 метров?\n" +
                ">>> ");
        try {
            time = scanner.nextDouble();
            if (time <= 49.5) {
                System.out.println("Оценка 5");
            } else if (time <= 52.0) {
                System.out.println("Оценка 4");
            } else if (time <= 56.0) {
                System.out.println("Оценка 3");
            } else {
                System.out.println("Оценка 2");
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка! Введён неподдерживаемый символ или превышен размер числа!");
            main(args);
        }


    }
}
