import java.util.Scanner;
/*
 * Part 1 Answers
 * 1. System.out.println(myString.length());
 * 2. System.out.println(myString.toUpperCase());
 * 3. String s = "";
 *    for (int i = 15; i < 22; i++) {
 *      char c = myString.charAt(i);
 *      if (i % 2 == 0) {
 *        c = Character.toUpperCase(c);
 *      }
 *      s += String.valueOf(c);
 *    }
 *    System.out.println(s);
 * 4a. true
 *  b. false
 *  c. true
 *  d. true
 */
public class Assignment2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Player 1: Choose rock, scissors, or paper:");
    String p1Choice = input.nextLine().toLowerCase();
    check(p1Choice);
    System.out.println("Player 2: Choose rock, scissors, or paper:");
    String p2Choice = input.nextLine().toLowerCase();
    check(p2Choice);
    if (p1Choice.charAt(0) == p2Choice.charAt(0)) {
      System.out.println("It is a tie.");
      System.exit(-1);
    }
    if (p1Choice.charAt(0) == 'r') {
      if (p2Choice.charAt(0) == 's') winner(1);
      winner(2);
    }
    if (p1Choice.charAt(0) == 's') {
      if (p2Choice.charAt(0) == 'p') winner(1);
      winner(2);
    }
    if (p2Choice.charAt(0) == 'r') winner(1);
    winner(2);
  }

  public static void check(String selection) {
    if (!selection.equals("rock"))
      if (!selection.equals("scissors"))
        if (!selection.equals("paper")) {
          System.out.println("Wrong choice!");
          System.exit(-1);
        }
  }

  public static void winner(int player) {
    System.out.println("Player " + player + " wins");
    System.exit(-1);
  }
}
