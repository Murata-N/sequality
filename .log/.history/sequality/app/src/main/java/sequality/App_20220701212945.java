/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    Calculate calculate = new Calculate();
    int a = 

    System.out.println(new App().getGreeting());
    System.out.println("Sum of 2 and 3 is " + calculate.sum(2, 3) + ". Average is " + calculate.average(2, 3) + ".");
    System.out.println("Sum of 1 to 10 is " + calculate.sum2(1, 10) + ". Average is " + calculate.average(1, 10) + ".");
    System.out.println("Sum of odd of 1 to 10 is " + calculate.sumOdd(1, 10) + ". Sum of even is " + calculate.sumEven(1, 10) + ".");
  }
}
