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

      System.out.println(new App().getGreeting());
      System.out.println("Sum of 2 and 3 is " + calculate.sum(2, 3) + ". Average is " + new Calculate().average(2, 3) + ".");
      System.out.println("Sum of 1 to 10 is " + calculate.sum2(1, 10) + ". Average is " + new Calculate().average(1, 10) + ".");
      System.out.println("Sum of odd of 1 to 10 is " + new Calculate().sumOdd(1, 10) + ". Sum of even is " + new Calculate().sumEven(1, 10) + ".");
    }
}
