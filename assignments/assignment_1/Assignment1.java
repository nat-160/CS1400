/*
// Expressions Output
// a=91
// b=1
// c=16
// d=2
// e=3
// f=33
// g=0
// h=15.0
// i=225.0
// j=16
*/
import java.text.DecimalFormat;
import java.util.*;

public class Assignment1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the competitor's name: ");
    String name = in.nextLine();
    System.out.println(
        "\nOlympic Javelin Throws\nEnter the distances, in meters, for " + name + "");
    double[] meters = new double[3];
    for (int i = 1; i <= 3; i++) {
      System.out.print("\nPlease enter the distance for throw " + i + ":");
      meters[i - 1] = in.nextDouble();
    }
    System.out.println("\nYards \t\tFeet \t\tInches \t\tCm");
    for (int i = 0; i < 3; i++) {
      DecimalFormat df = new DecimalFormat("#0.00");
      String s = df.format(1.093 * meters[i]) + "\t\t";
      s += df.format(3.279 * meters[i]) + "\t\t";
      s += df.format(39.348 * meters[i]) + "\t\t";
      s += df.format(100.0 * meters[i]);
      System.out.println(s);
    }
  }
}
