import java.util.Stack;
import java.util.Scanner;
public class UseCasePalindromeCheckerApp {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Read input from user
    System.out.print("Enter a string: ");
    String input = sc.nextLine();

    // Convert to lowercase for case-insensitive check
    input = input.toLowerCase();

    // Create stack
    Stack<Character> stack = new Stack<>();

    // Step 1: Push characters into stack
    for (char c : input.toCharArray()) {
      stack.push(c);
    }

    // Step 2: Pop and compare
    boolean isPalindrome = true;

    for (char c : input.toCharArray()) {
      if (c != stack.pop()) {
        isPalindrome = false;
        break;
      }
    }

    // Step 3: Print result
    if (isPalindrome) {
      System.out.println("The string is a Palindrome.");
    } else {
      System.out.println("The string is NOT a Palindrome.");
    }

    sc.close();
    }
}
