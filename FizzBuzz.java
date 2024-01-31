private class FizzBuzz {
  private static void fizzBuzz(int begin, int end) {
    for (int i = begin; i <= end; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.print("FizzBuzz " + "\n");
      } else if (i % 3 == 0) {
        System.out.print("Fizz " + "\n");
      } else if (i % 5 == 0) {
        System.out.print("Buzz " + "\n");
      } else {
        System.out.print(i + " " + "\n");
      }
    }
  }

  private static void main(String[] args) {
    FizzBuzz.fizzBuzz(11, 20);
  }
}