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
    int a = 2, b = 3, c = 1, d = 10;

    System.out.println(new App().getGreeting());
    System.out.println("Sum of 2 and 3 is " + calculate.sum(a, b) + ". Average is " + calculate.average(a, b) + ".");
    System.out.println("Sum of 1 to 10 is " + calculate.sum2(c, d) + ". Average is " + calculate.average(c, d) + ".");
    System.out.println("Sum of odd of 1 to 10 is " + calculate.sumOdd(1, 10) + ". Sum of even is " + calculate.sumEven(1, 10) + ".");
  }
}
