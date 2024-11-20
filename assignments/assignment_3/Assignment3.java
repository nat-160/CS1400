import java.util.Scanner;
/*
 * Written Question #1
 * grade = 'F';
 * if(score>59) grade='D';
 * if(score>69) grade='C';
 * if(score>79) grade='B';
 * if(score>89) grade='A';
 *
 * Written Question #2
 * switch(Character.toUpperCase(letter)){
 *   case 'A':
 *     System.out.println("You are doing good!");
 *     break;
 *   case 'B':
 *     System.out.println("You are doing good!");
 *     break;
 *   case 'C':
 *     System.out.println("You need to study more!");
 *     break;
 *   case 'D':
 *     System.out.println("You need to study more!");
 *     break;
 *   default:
 *     System.out.println("Maybe next time!");
 * }
 */
public class Assignment3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a string.");
    String firstString = input.nextLine();
    System.out.println("Please enter another string.");
    String secondString = input.nextLine();

    System.out.println("Command Options");
    System.out.println("-----------------------------------");
    System.out.println("Option a: checks if the length of the two strings are the same.");
    System.out.println("Option b: checks if two strings are the same or different.");
    System.out.println(
        "Option c: checks which string is lexically larger, or if they are the same");
    System.out.println("Option d: prints out the first character (index 0) of each string");
    System.out.println(
        "Option e: prints out a new string consisting of the first string concatenated (appended) with the second string.");
    System.out.println("Option f: prints out two strings using upper case letters.");
    System.out.println("Option q: quit the program.");

    while (true) {
      System.out.println("Please, enter an option from the menu.");
      String choice = input.nextLine();
      switch (choice.toLowerCase()) {
        case "a":
          System.out.print("The lengths are ");
          if (firstString.length() != secondString.length()) System.out.print("not ");
          System.out.println("the same.");
          break;
        case "b":
          System.out.print("The two strings are ");
          if (firstString.equals(secondString)) System.out.print("not ");
          System.out.println("different.");
          break;
        case "c":
          if (firstString.compareTo(secondString) > 0) System.out.print("The first ");
          else if (secondString.compareTo(firstString) > 0) System.out.print("The second ");
          else System.out.print("Neither ");
          System.out.println("string is lexically larger.");
          break;
        case "d":
          System.out.println("The first character of the first string is " + firstString.charAt(0));
          System.out.println(
              "The first character of the second string is " + secondString.charAt(0));
          break;
        case "e":
          System.out.println(
              "The concatenation of two strings is \"" + firstString + secondString + "\".");
          break;
        case "f":
          System.out.println(
              "The first string using upper case letters: " + firstString.toUpperCase());
          System.out.println(
              "The second string using upper case letters: " + secondString.toUpperCase());
          break;
        case "q":
          System.out.println("Goodbye!");
          System.exit(-1);
          break;
        default:
          System.out.println("Invalid option.");
      }
    }
  }
}
