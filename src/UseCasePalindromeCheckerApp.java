import java.util.Scanner;

public class UseCasePalindromeCheckerApp {
  public  static void main(String[] args) {

      System.out.println("Hello there , Welcome to my APP");

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter a string: ");
      String original = sc.nextLine();

      // Convert to lowercase (optional, for case-insensitive check)
      String input = original.toLowerCase();

      // Reverse the string
      String reversed = "";
      for (int i = input.length() - 1; i >= 0; i--) {
          reversed += input.charAt(i);
      }

      // Check using if-else
      if (input.equals(reversed)) {
          System.out.println("The string is a Palindrome.");
      } else {
          System.out.println("The string is NOT a Palindrome.");
      }

      sc.close();
    }
}






