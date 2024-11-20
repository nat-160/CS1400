import java.util.Scanner;

public class Assignment4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a positive integer. Enter -1 to quit.");
    int num = input.nextInt();
    int max = 0, min = Integer.MAX_VALUE;
    double sum = 0, count = 0;
    while (num > 0) {
      if (max < num) max = num;
      if (min > num) min = num;
      sum += num;
      count++;
      checkPrime(num);
      System.out.println("Enter a positive integer. Enter -1 to quit.");
      num = input.nextInt();
    }
    System.out.println("The maximum positive number is: " + max);
    System.out.println("The minimum positive number is: " + min);
    System.out.println("The sum is: " + (int) sum);
    System.out.println("The count of number(s) is: " + (int) count);
    System.out.println("The average is: " + String.format("%.1f", sum / count));
  }

  public static void checkPrime(int num) {
    System.out.print("The number " + num + " is ");
    if (num < 4) {
      System.out.println("not a prime number.");
      return;
    }
    for (int i = 2; i < (num / 2) + 1; i++) {
      if (num % i == 0) {
        System.out.println("not a prime number.");
        return;
      }
    }
    System.out.println("a prime number.");
  }
}
