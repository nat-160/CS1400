public class Geek {
  private String name;
  private int numberOfQuestions;

  // the Geek's name, the number of questions is assigned to zero
  public Geek(String name) {
    this.name = name;
    numberOfQuestions = 0;
  }

  // takes no parameters and returns the Geeks’s name as a String
  public String getName() {
    return name;
  }

  // takes no parameters and returns as an int how many questions s/he has been asked
  public int getNumberOfQuestions() {
    return numberOfQuestions;
  }

  // takes an integer and returns a boolean value indicating if the num is even or not
  public boolean isEven(int num) {
    numberOfQuestions++;
    return num % 2 == 0;
  }

  // takes a String and integer as parameters and returns a string that
  // consist of the string parameter concatenated with itself count times
  public String multiConcat(String text, int count) {
    numberOfQuestions++;
    if (count < 2) return text;
    String concat = "";
    for (int i = 0; i < count; i++) concat += text;
    return concat;
  }

  // takes two integers and computes and returns an int which is the
  // sum of the integers in that range (exclusive)
  public int sumRange(int num1, int num2) {
    numberOfQuestions++;
    if (num1 >= num2) return 0;
    int sum = 0;
    for (int i = num1 + 1; i < num2; i++) sum += i;
    return sum;
  }

  // takes three integers and returns true if they are in order
  public boolean sorted(int num1, int num2, int num3) {
    numberOfQuestions++;
    return num1 < num2 && num2 < num3;
  }

  // takes a string and counts and returns the number of times
  // the character ‘A’ is found in the string
  public int countA(String text) {
    numberOfQuestions++;
    int count = 0;
    for (char c : text.toUpperCase().toCharArray()) if (c == 'A') count++;
    return count;
  }

  // takes an integer and determines number of digits in the number num.
  public int countDigits(int num) {
    numberOfQuestions++;
    return Integer.toString(num).length();
  }

  // takes an integer and returns true if the num is prime
  public boolean isPrime(int num) {
    numberOfQuestions++;
    if (num < 2) return false;
    if (num < 4) return true;
    for (int i = 2; i < 1 + num / 2; i++) if (num % i == 0) return false;
    return true;
  }
}
