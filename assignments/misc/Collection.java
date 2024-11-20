public class Collection {

  // private instance variables
  private int count;
  private int[] numArray;

  // constructor
  public Collection(int arraySize) {
    numArray = new int[arraySize];
    count = 0;
  }

  // return index of number, -1 if no exist
  private int search(int searchingNum) {
    for (int i = 0; i < count; i++) {
      if (numArray[i] == searchingNum) {
        return i;
      }
    }
    return -1;
  }

  // returns if number able to be added
  public boolean add(int numberToAdd) {
    if (search(numberToAdd) == -1) {
      if (count == numArray.length) {
        doubleArray();
      }
      numArray[count++] = numberToAdd;
      return true;
    }
    return false;
  }

  // returns if number was removed
  public boolean remove(int numberToRemove) {
    if (search(numberToRemove) != -1) {
      for (int i = search(numberToRemove); i < count - 1; i++) {
        numArray[i] = numArray[i + 1];
      }
      count--;
      return true;
    }
    return false;
  }

  // doubles max array size
  private void doubleArray() {
    int[] temp = new int[numArray.length * 2];
    for (int i = 0; i < count; i++) {
      temp[i] = numArray[i];
    }
    numArray = temp;
  }

  // returns largest int in array
  public int findLargest() {
    int value = Integer.MIN_VALUE;
    for (int i = 0; i < count; i++)
      if (value < numArray[i]) {
        value = numArray[i];
      }
    return value;
  }

  // returns average of all values
  public double computeAvg() {
    double sum = 0.0;
    for (int i = 0; i < count; i++) {
      sum += numArray[i];
    }
    return sum / numArray.length;
  }

  // returns number of positive integers in array
  public int countPositives() {
    int total = 0;
    for (int i = 0; i < count; i++) {
      if (numArray[i] > 0) total++;
    }
    return total;
  }

  // returns string representation of array
  public String toString() {
    String str = "{";
    for (int i = 0; i < count; i++) {
      str += "" + numArray[i] + ", ";
    }
    if (count > 0) {
      str = str.substring(0, str.length() - 2);
    }
    str += "}";
    return str;
  }
}
