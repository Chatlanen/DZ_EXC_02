/*
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и
 * возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
 * приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 * 
 */


import java.util.Scanner;

public class App_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float number = reqFloatIn(scan);
        System.out.printf("Введённое дробное число: %.2f%n", number);
    }

    private static float reqFloatIn(Scanner scanner) {
        while (true) {
            System.out.print("Введите дробное число: ");
            String input = scanner.nextLine();

            try {
                float value = Float.parseFloat(input);
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Попробуйте ещё раз. (Пример 1.25)");
            }
        }
    }
}
