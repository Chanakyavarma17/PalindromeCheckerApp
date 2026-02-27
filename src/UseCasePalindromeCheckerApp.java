
public class UseCasePalindromeCheckerApp {

  public static void main(String[] args) {

    // Original input
    String input = "A man a plan a canal Panama";

    // Step 1: Normalize string
    String normalized = input
            .replaceAll("\\s+", "") // remove spaces
            .toLowerCase(); // convert to lowercase

    // Step 2: Apply palindrome logic
    boolean isPalindrome = true;

    for (int i = 0; i < normalized.length() / 2; i++) {
      if (normalized.charAt(i) !=
              normalized.charAt(normalized.length() - 1 - i)) {
        isPalindrome = false;
        break;
      }
    }

    // Step 3: Print result
    System.out.println("Input : " + input);
    System.out.println("Is Palindrome? : " + isPalindrome);
  }
}
