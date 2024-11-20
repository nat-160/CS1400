public class Palindrome {

  public static boolean isPalindrome(String text) {

    // checking the base case (hint: check the length of the text)
    if (text.length() < 2) {
      return true; // It is a palindrome
    } else {
      // Get first and last characters converted to lowercase.
      char f = Character.toLowerCase(text.charAt(0));
      char l = Character.toLowerCase(text.charAt(text.length() - 1));
      // Check if first and last characters are letters (not punctuation marks or spaces)
      if (Character.isAlphabetic(f) && Character.isAlphabetic(l)) {
        // If both are equal, remove them and return the output of another isPalindrome method call
        // that is passed the remainder of the text.
        if (f == l) {
          String next = text.substring(1, text.length() - 1);
          return isPalindrome(next);
        } else {
          return false; // It is not a palindrome
        }
      }
      // Test if the last character is not a letter.
      else if (!Character.isAlphabetic(l)) {
        // Remove the last character and return the output of another isPalindrome method call that
        // is passed the remainder of the text.
        String next = text.substring(0, text.length() - 1);
        return isPalindrome(next);
      }
      // In this case, the first character is not a letter.
      else {
        // Remove the first character and return the output of another isPalindrome method call that
        // is passed the remainder of the text.
        String next = text.substring(1, text.length());
        return isPalindrome(next);
      }
    }
  }
}
