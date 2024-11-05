
/*
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 * 
 */

import java.util.Scanner;

public class App_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Введите строку: ");
            String in_str = scan.nextLine().trim();

            if (in_str.isEmpty()) {
                throw new Exception("Пустые строки вводить нельзя.");
            }

            System.out.println("Вы ввели: " + in_str);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scan.close();
        }
    }
}
