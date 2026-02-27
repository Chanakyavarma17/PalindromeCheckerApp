
public class UseCasePalindromeCheckerApp {

  public static void main(String[] args) {

    String input = "madam";

    // Call recursive method
    boolean result = checkString(input, 0, input.length() - 1);

    // Display result
    System.out.println("Input : " + input);
    System.out.println("Is Palindrome? : " + result);
  }

  // Recursive method to check palindrome
  private static boolean checkString(String str, int start, int end) {

    // Base condition: if pointers cross or meet
    if (start >= end) {
      return true;
    }

    // If characters mismatch
    if (str.charAt(start) != str.charAt(end)) {
      return false;
    }

    // Recursive call
    return checkString(str, start + 1, end - 1);

  }
}
