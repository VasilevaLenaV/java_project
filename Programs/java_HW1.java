
/* 
Урок 1. Знакомство с языком программирования Java
Вычислить n-ое треугольного число(сумма чисел от 1 до n)
*/

package Programs;

import java.util.Scanner;

public class java_HW1 {

     public static void main(String[] args) {

          try (Scanner in = new Scanner(System.in)) {

               System.out.println("Вычислить n-ое треугольного число(сумма чисел от 1 до n)");

               System.out.print("Ввведите число n: ");

               int numberN = in.nextInt();

               System.out.printf("Результат: %d",triangle(numberN));

          }catch (Exception e) {

               System.out.println(e);

          }

     }


     static int triangle(int n) {

          if(n==1)  

              return 1;

          else

              return( n + triangle(n-1) );

      }

}

