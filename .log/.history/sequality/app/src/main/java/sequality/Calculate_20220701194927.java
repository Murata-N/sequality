package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public int sumOddEven(int x, int y) {
    int odd = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 1) {
        odd = odd + i;
      }
    }
    return odd;
  }
}
