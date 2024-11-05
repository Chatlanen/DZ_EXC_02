
// Задание 2
// try {
//     int d = 0;
//     double catchedRes1 = intArray[8] / d;
//     System.out.println("catchedRes1 = " + catchedRes1);
//  } catch (ArithmeticException e) {
//     System.out.println("Catching exception: " + e);
//  }
 


public class App {
    public static void main(String[] args) throws Exception {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};



        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);

            /// Добавим другие возможные исключения multicatch (NullPointerException|ArrayIndexOutOfBoundsException)
         } catch (ArithmeticException|NullPointerException|ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);

         }


    }
}
