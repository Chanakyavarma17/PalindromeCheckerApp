import java.util.Scanner;

public class UseCasePalindromeCheckerApp {
  public  static void main(String[] args) {


      String original = "madam"; // You can change this input
      String reversed = "";

      // Loop (for loop) – iterate through characters in reverse order
      for (int i = original.length() - 1; i >= 0; i--) {
          // String Concatenation (+) – builds reversed string character by character
          reversed = reversed + original.charAt(i);
      }

      // Display reversed string (for clarity)
      System.out.println("Original String: " + original);
      System.out.println("Reversed String: " + reversed);

      // equals() Method – compare actual content of two String objects
      if (original.equals(reversed)) {
          System.out.println(original + " is a palindrome.");
      } else {
          System.out.println(original + " is not a palindrome.");
      }



  }
}






