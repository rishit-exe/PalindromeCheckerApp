import javax.xml.transform.Source;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    static void main() {
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");

        String str = "noon";
        System.out.println("Input text: " + str);

        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()){
            stack.push(c);
        }

        boolean isPalindrome = true;

        for(char c : str.toCharArray()){
            if(c != stack.pop()){
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is a palindrome? : " + isPalindrome);
    }
}
