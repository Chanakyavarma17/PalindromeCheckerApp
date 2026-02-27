import java.util.LinkedList;
public class UseCasePalindromeCheckerApp {

  public static void main(String[] args) {

    // Define input string
    String input = "level";

    // Create LinkedList to store characters
    LinkedList<Character> list = new LinkedList<>();

    // Add each character to the list
    for (char c : input.toCharArray()) {
      list.add(c);
    }

    // Flag to track palindrome state
    boolean isPalindrome = true;

    // Compare until zero or one element remains
    while (list.size() > 1) {
      char first = list.removeFirst();
      char last = list.removeLast();

      if (first != last) {
        isPalindrome = false;
        break;
      }
    }

    // Display result
    System.out.println("Input : " + input);
    System.out.println("Is Palindrome? : " + isPalindrome);


  }
}
