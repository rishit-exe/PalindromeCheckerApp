import javax.xml.transform.Source;
import java.util.*;

public class PalindromeCheckerApp {
    static void main() {
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");

        String str = "refer";
        System.out.println("Input text: " + str);

        Deque<Character> deque = new ArrayDeque<>();

        for(char c : str.toCharArray()){
            deque.add(c);
        }

        boolean isPalindrome = true;

        while(deque.size() > 1){
            if(deque.removeFirst() != deque.removeLast()){
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is a palindrome? : " + isPalindrome);
    }
}
