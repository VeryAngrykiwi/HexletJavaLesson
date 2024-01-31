public class DifferenceAngle {
  public static int diff(int angle1, int angle2) {
    int diff1 = Math.abs(angle1 - angle2);
    int diff2 = 360 - diff1;
    return Math.min(diff1, diff2);
  }
}