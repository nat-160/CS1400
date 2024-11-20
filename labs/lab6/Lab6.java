import java.util.Scanner;

// ===========================================================
// Create and determine properties of a Quadrilateral
// ===========================================================

public class Lab6 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int side1, side2, side3, side4;
    String another;

    do {

      // Read the sides of the quadrilateral
      System.out.println("Enter the sides of the quadrilateral: ");
      side1 = input.nextInt();
      side2 = input.nextInt();
      side3 = input.nextInt();
      side4 = input.nextInt();
      // create a quadrilateral named "shape" by using the default constructor
      Quadrilateral shape = new Quadrilateral();

      // set the sides of the created quadrilateral
      shape.setSide1(side1);
      shape.setSide2(side2);
      shape.setSide3(side3);
      shape.setSide4(side4);

      // print all quadrilateral sizes in a single line
      System.out.println(
          "Sides: "
              + shape.getSide1()
              + " "
              + shape.getSide2()
              + " "
              + shape.getSide3()
              + " "
              + shape.getSide4());

      // fill out the code to check for rectangle
      System.out.println("It is " + ((shape.isRectangle()) ? "a " : "not a ") + "rectangle");

      // fill out the code to check for square
      System.out.println("It is " + ((shape.isSquare()) ? "a " : "not a ") + "square");

      System.out.println();
      System.out.print("Check another Quadrilateral (y/n)? ");
      another = input.next();
      System.out.println();

    } while (another.equalsIgnoreCase("y"));
    input.close();
  } // method main
} // class Lab6
