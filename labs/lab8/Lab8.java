import java.util.Scanner;
public class Lab8 {
  public static void main(String[] args) {
    // create Scanner
    Scanner input = new Scanner(System.in);
    System.out.println("How many elements in the array?");

    // initialize array
    int numElements = input.nextInt();
    int[] myArray = new int[numElements];

    // store array values
    for (int i = 0; i < numElements; i++) {
      System.out.println("Please enter the next value:");
      myArray[i] = input.nextInt();
    }

    // sort array
    for (int i = 0; i < numElements; i++) {
      for (int j = i + 1; j < numElements; j++) {
        if (myArray[i] >= myArray[j]) {
          int temp = myArray[i];
          myArray[i] = myArray[j];
          myArray[j] = temp;
        }
      }
    }

    // output array
    System.out.println("The array after sorting");
    for (int i = 0; i < numElements; i++) {
      System.out.print(myArray[i]);
      if (i < numElements - 1) System.out.print(", ");
    }
    System.out.println("\n");

    // remove minimum
    for (int i = 0; i < numElements - 1; i++) {
      myArray[i] = myArray[i + 1];
    }
    myArray[numElements - 1] = 0;

    // output array
    System.out.println("The array with the minimum removed");
    for (int i = 0; i < numElements; i++) {
      System.out.print(myArray[i]);
      if (i < numElements - 1) System.out.print(", ");
    }
    System.out.println("\n");

    // get removal value
    System.out.println("Enter the value to search and remove:");
    int search = input.nextInt();
    boolean isFound = false;

    // remove removal value
    for (int i = 0; i < numElements; i++) {
      if (myArray[i] == search) {
        isFound = true;
        for (int j = i; j < numElements - 1; j++) {
          myArray[j] = myArray[j + 1];
        }
        i--;
      }
    }

    // print if value found
    if (isFound) {
      System.out.println("Search element found");
    } else {
      System.out.println("Search element NOT found");
    }
    System.out.println();

    // print final array
    System.out.println("The final array");
    for (int i = 0; i < numElements; i++) {
      System.out.print(myArray[i]);
      if (i < numElements - 1) System.out.print(", ");
    }
    System.out.println();
  }
}
