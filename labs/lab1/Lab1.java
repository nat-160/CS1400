import java.util.Scanner; // imports

public class Lab1 { // class declaration
  public static void main(String[] args) { // main method declaration
    // Setting up a scanner for input
    Scanner input = new Scanner(System.in); // our input scanner object

    // Declaring variables
    int test1, test2, test3; // values for test scores
    final int NUM_TESTS = 3; // number of tests
    double average; // final answer

    // Getting the input
    System.out.println("Enter the score on the first test: "); // prompt
    test1 = input.nextInt(); // read in the next integer
    System.out.println("Enter the score on the second test: "); // prompt
    test2 = input.nextInt(); // read in the next integer
    System.out.println("Enter the score on the third test: "); // prompt
    test3 = input.nextInt(); // read in the next integer

    // Calculate the average
    average = (test1 + test2 + test3) / (double) NUM_TESTS; // caculate the average

    // Display results
    System.out.println("Your average score is: " + average); // display the average
  } // close main method
} // close class
// close class
