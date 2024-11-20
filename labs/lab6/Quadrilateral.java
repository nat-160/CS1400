public class Quadrilateral {
  private int side1, side2, side3, side4;

  public Quadrilateral() {}

  public int getSide1() {
    return side1;
  }

  public int getSide2() {
    return side2;
  }

  public int getSide3() {
    return side3;
  }

  public int getSide4() {
    return side4;
  }

  public void setSide1(int length) {
    side1 = length;
  }

  public void setSide2(int length) {
    side2 = length;
  }

  public void setSide3(int length) {
    side3 = length;
  }

  public void setSide4(int length) {
    side4 = length;
  }

  private boolean hasCongruentDiagonals(int side1, int side2, int side3, int side4) {
    return findDiagonal(side1, side2) == findDiagonal(side3, side4);
  }

  private double findDiagonal(double s1, double s2) {
    return Math.sqrt(s1 * s1 + s2 * s2);
  }

  public boolean isRectangle() {
    if (side1 == side3 && side2 == side4) return hasCongruentDiagonals(side1, side2, side3, side4);
    return false;
  }

  public boolean isSquare() {
    return isRectangle() && side1 == side2;
  }
}
