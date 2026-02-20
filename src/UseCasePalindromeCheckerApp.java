import java.util.Scanner;

public class UseCasePalindromeCheckerApp {
  public  static void main(String[] args) {


      String original = "racecar"; // You can change this input

      // Convert string to character array
      char[] chars = original.toCharArray();

      // Two-pointer approach
      int left = 0;
      int right = chars.length - 1;
      boolean isPalindrome = true;

      while (left < right) {
          // Compare start & end characters using array indexing
          if (chars[left] != chars[right]) {
              isPalindrome = false;
              break;
          }
          left++;
          right--;
      }

      // Display result
      if (isPalindrome) {
          System.out.println(original + " is a palindrome.");
      } else {
          System.out.println(original + " is not a palindrome.");
      }


  }
}






