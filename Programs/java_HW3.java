
/*
Вывести все простые числа от 1 до 1000 (простые числа - это числа которые делятся только на себя и на единицу без остатка. Чтобы найти остаток от деления используйте оператор % , например 10%3 будет равно единице)
*/

package Programs;

public class java_HW3  {

     public static void main(String[] args) {

          System.out.println("Вывести все простые числа от 1 до 1000 (простые числа - это числа которые делятся только на себя и на единицу без остатка.\nЧтобы найти остаток от деления используйте оператор % , например 10%3 будет равно единице)");

          int numberN = 1000;

          System.out.println("Результат:");

          primeNumbers(numberN);

     }

     public static void primeNumbers(int n) {



          for (int i = 1; i <= n; i++) {

              boolean isPrime = true;

              for (int j = 2; j <= Math.floor(Math.sqrt(i)); j++){

                  if ((i % j) == 0) { 

                      isPrime = false;

                      break;

                  }

              }

              if (isPrime){

                  System.out.print(i + " ");

              }

          }

      }

}
