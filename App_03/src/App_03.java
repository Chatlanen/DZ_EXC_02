
// Задание 3

// public static void main(String[] args) throws Exception {
//    try {
//        int a = 90;
//        int b = 3;
//        System.out.println(a / b);
//        printSum(23, 234);
//        int[] abc = { 1, 2 };
//        abc[3] = 9;
//    } catch (Throwable ex) {
//        System.out.println("Что-то пошло не так...");
//    } catch (NullPointerException ex) {
//        System.out.println("Указатель не может указывать на null!");
//    } catch (IndexOutOfBoundsException ex) {
//        System.out.println("Массив выходит за пределы своего размера!");
//    }
// }
// public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//    System.out.println(a + b);
// }

public class App_03 {
    /// Если указать в main "throws Exception" метод может генерировать исключения, которые не будут обрабатываться непосредственно в самом методе.
    /// Вместо этого эти исключения будут переданы вверх по стеку вызовов, и ответственность за их обработку ляжет на вызывающий код.
    /// Поскольку это основной метод передавать вверх по стеку нет смысла.
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            //printSum(23, 234);
            // тест исключения в методе printSum
            printSum(23, null);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException e) {
            /// Срабатывание данного исключения неоднозначно определяет место ошибки.
            /// Указатель не может указывать на null!java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because "b" is null
            /// Переменная b присутствует и в методе main и в методе printSum
            System.out.println("Указатель не может указывать на null!" + e);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        ///
        ///  Класс Throwable ябляется родительским для всех исключений, если он сработает первым остальные исключения не сработают.
        ///  Поэтому ставим его последним
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        } 
    }


    /// Данный метод не считывает файл, исключение FileNotFoundException не корректно
    /// Значения a и b могут иметь значение null.
    /// Правильно было бы использовать исключение NullPointerException.
    /// Исключение будет передано вверх по стеку вызовов и обработано в методе main.
    public static void printSum(Integer a, Integer b) throws NullPointerException {
       System.out.println(a + b);
    }
}

