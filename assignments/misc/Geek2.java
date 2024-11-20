public class Geek2 {
  public static boolean find(String str, String match) {
    if (str.length() < match.length()) {
      return false;
    }
    if (str.substring(0, match.length()).equals(match)) {
      return true;
    }
    return find(str.substring(1), match);
  }

  public static int digitSum(int n) {
    if (n < 10) {
      return n;
    }
    return n % 10 + digitSum(n / 10);
  }

  public static int pow(int a, int n) {
    if (n == 1) {
      return a;
    }
    return a * pow(a, n - 1);
  }

  public static int smallestDigit(int number) {
    if (number < 10) {
      return number;
    }
    int small = smallestDigit(number / 10);
    return (number % 10 < small) ? number % 10 : small;
  }

  public static String reverse(String text) {
    if (text.length() < 2) return text;
    return reverse(text.substring(1)) + text.charAt(0);
  }
}
