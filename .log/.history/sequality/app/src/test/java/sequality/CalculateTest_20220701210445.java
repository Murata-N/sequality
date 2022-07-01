package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testSum2() {
    Calculate calculate = new Calculate();
    int expected = 15;
    assertEquals(expected, calculate.sum2(1, 5));
  }

  @Test
  public void testAverage() {
    Calculate calculate = new Calculate();
    int expected = 3;
    assertEquals(expected, calculate.average(1, 5));
  }

  @Test
  public void testSumOdd() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sumOdd(1, 10));
  }
}
