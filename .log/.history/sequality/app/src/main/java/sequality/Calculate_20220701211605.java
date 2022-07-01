package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public int sum2(int x, int y) {
    int z = 0;
    for (int i = x; i <= y; i++) {
      z = z + i;
    }
    return z;
  }

  public double average(int x, int y) {
    return (double)sum2(x, y) / (y-x+1);
  }

  public int sumOdd(int x, int y) {
    int odd = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 1) {
        odd = odd + i;
      }
    }
    return odd;
  }

  public int sumEven(int x, int y) {
    int even = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 0) {
        even = even + i;
      }
    }
    return even;
  }
}
