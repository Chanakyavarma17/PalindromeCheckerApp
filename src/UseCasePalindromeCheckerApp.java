import java.util.Stack;
public class UseCasePalindromeCheckerApp {

  public static void main(String[] args) {

    String input = "Level";

    // Use Stack strategy directly (as per UC12 base)
    StackStrategy strategy = new StackStrategy();

    // ✅ Capture start time
    long startTime = System.nanoTime();

    // Run algorithm
    boolean result = strategy.check(input);

    // ✅ Capture end time
    long endTime = System.nanoTime();

    // ✅ Calculate execution time
    long executionTime = endTime - startTime;

    // Display results
    System.out.println("Input : " + input);
    System.out.println("Is Palindrome? : " + result);
    System.out.println("Execution Time : " + executionTime + " ns");
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

  @Override
  public boolean check(String input) {

    input = input.toLowerCase();

    Stack<Character> stack = new Stack<>();

    for (char c : input.toCharArray()) {
      stack.push(c);
    }

    for (char c : input.toCharArray()) {
      if (c != stack.pop()) {
        return false;
      }
    }

    return true;
  }
}
