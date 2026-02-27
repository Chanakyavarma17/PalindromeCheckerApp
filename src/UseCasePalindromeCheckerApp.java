import java.util.Stack;
public class UseCasePalindromeCheckerApp {

  public static void main(String[] args) {

    String input = "Level";

    // Inject strategy
    PalindromeStrategy strategy = new StackStrategy();

    boolean result = strategy.check(input);

    System.out.println("Input : " + input);
    System.out.println("Is Palindrome? : " + result);
  }
}

/**
 * =========================================================
 * INTERFACE - PalindromeStrategy
 * =========================================================
 */
interface PalindromeStrategy {

  boolean check(String input);
}

/**
 * =========================================================
 * CLASS - StackStrategy
 * =========================================================
 */
class StackStrategy implements PalindromeStrategy {

  /**
   * Implements palindrome validation using Stack.
   */
  @Override
  public boolean check(String input) {

    // Normalize (important for Level → true)
    input = input.toLowerCase();

    // Create stack
    Stack<Character> stack = new Stack<>();

    // Push characters
    for (char c : input.toCharArray()) {
      stack.push(c);
    }

    // Compare by popping
    for (char c : input.toCharArray()) {
      if (c != stack.pop()) {
        return false;
      }
    }

    return true;
  }
}
