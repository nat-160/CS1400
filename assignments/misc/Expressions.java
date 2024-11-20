public class Expressions {
  public static void main(String[] args) {
    int a = 15;
    int b = 16;
    int c = 5;
    int d = 17;
    System.out.println(
        (a + b) / c); // 15 and 16 are added and the result is divided by 5 with quotient 6
    System.out.println(
        a + b / c); // 16 is divided by 5 with quotient 3 which is then added to 15 with
    // sum18
    System.out.println(a * c + b); // a
    System.out.println(a % c + d / d); // b
    System.out.println(a + 1); // c
    System.out.println(d % c); // d
    System.out.println(d / c); // e
    System.out.println(d + a / d + b); // f
    System.out.println((d + a) / (d + b)); // g
    System.out.println(Math.sqrt(a * a)); // h
    System.out.println(Math.pow(a, 2)); // i
    System.out.println(Math.max(a, b)); // j
  }
}
