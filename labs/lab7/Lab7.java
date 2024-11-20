import java.util.Scanner;

public class Lab7 {
  public static void main(String[] args) {
    // ========== Declaring variables ==========

    // An integer for the array size.
    int size = 0;

    // A double for the current element.
    double current = 0.0;

    // A double for the sum of elements.
    double sum = 0.0;

    // A scanner object for requesting input from System.in.
    Scanner input = new Scanner(System.in);

    // ========== Request Array size from user ==========

    // Print this message "How many elements in the array?"
    System.out.println("How many elements in the array?");

    // Request an integer from the user using the Scanner object
    // and store the inputted value in the integer declared above.
    size = input.nextInt();

    // ========== Declare the array ==========

    // Declare a new array of size equal to the size requested
    double[] nums = new double[size];

    // For reference, the following is an EXAMPLE declaration of an

    // integer array of a fixed size. DO NOT USE THIS ARRAY.
    // int[] integerArray = new int[25];

    // ========== Fill in the array ==========

    for (int i = 0; i < size; i++) {

      // Display the message: "Please enter the next value."
      System.out.println("Please enter the next value.");

      // Request the next element (double) from the user using
      // the Scanner object.
      current = input.nextDouble();

      // Store this element at the ith position of the array
      nums[i] = current;
    }

    // ========== Display and sum the array's elements ==========

    // Construct a for loop that runs backwards through the array,
    // starting at the last element and ending at the first.

    for (int i = size - 1; i >= 0; i--) {

      // Inside this for loop, print the ith element of the array
      // and a tab, with NO newline characters.
      System.out.print(nums[i] + "\t");

      // If this element is the 8th one on its line, print a
      // newline character to advance to the next line.
      if ((size - i) % 8 == 0) System.out.print("\n");

      // Also inside this for loop, add the value of the ith
      // element to the current value of the double for the sum
      // of elements.
      sum += nums[i];
    }

    // ========== Display the sum ==========

    // Print the following message to the user, preceded by a
    // newline character.
    // "The sum of the array's elements is: <sum>"
    System.out.println("\nThe sum of the array's elements is: " + sum);
  } // Close the main function.
} // Close the Lab7 class.
