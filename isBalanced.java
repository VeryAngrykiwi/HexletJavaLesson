public class isBalanced {
  public static boolean isBalanced(String str) {
    int count = 0;
    for(char c : str.toCharArray()) {
      if(c == '(') {
        count++;
      } else if(c == ')') {
        count--;
      }
      if (count < 0) {
        return false;
      }
    }
    return count == 0;
  }
}