
public class UseCasePalindromeCheckerApp {

  public static void main(String[] args) {

    // Original input
    String input = "racecar";

    // Create service object
    PalindromeService service = new PalindromeService();

    // Call method
    boolean result = service.checkPalindrome(input);

    // Print result
    System.out.println("Input : " + input);
    System.out.println("Is Palindrome? : " + result);
  }
}

// Service class that contains palindrome logic
class PalindromeService {

  // Method to check palindrome
  public boolean checkPalindrome(String input) {

    int start = 0;
    int end = input.length() - 1;

    while (start < end) {
      if (input.charAt(start) != input.charAt(end)) {
        return false;
      }
      start++;
      end--;
    }

    return true;

  }
}
