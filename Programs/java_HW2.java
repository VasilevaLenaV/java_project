
/*
Вычислить n! (произведение чисел от 1 до n)
*/

package Programs;

import java.util.Scanner;

public class java_HW2 {

     public static void main(String[] args) {

          try (Scanner in = new Scanner(System.in)) {

               System.out.println("Вычислить n! (произведение чисел от 1 до n)");

               System.out.print("Ввведите число n: ");

               int numberN = in.nextInt();

               System.out.printf("Результат: %d",recursion(numberN));

          }catch (Exception e) {

               System.out.println(e);

          }

     }

      public static int recursion(int n) {

          if (n == 1) {

              return 1;

          }

          return recursion(n - 1) * n;

      }

}