import javax.xml.transform.Source;
import java.util.*;

public class PalindromeCheckerApp {
    static void main() {
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");

        String str = "level";
        System.out.println("Input text: " + str);

        LinkedList<Character> list = new LinkedList<>();

        for(char c : str.toCharArray()){
            list.add(c);
        }

        boolean isPalindrome = true;

        while(list.size() > 1) {
            if (list.getFirst() != list.getLast()){
                isPalindrome = false;
                break;
            }
            list.removeFirst();
            list.removeLast();
        }

        System.out.println("Is a palindrome? : " + isPalindrome);
    }
}
