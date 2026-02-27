import javax.xml.transform.Source;
import java.lang.management.PlatformLoggingMXBean;
import java.util.*;

public class PalindromeCheckerApp {
    static void main() {
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");

        String str = "racecar";
        System.out.println("Input text: " + str);

        PalindromeStrategy strategy;

        String algorithmChoice = "STACK";

        if (algorithmChoice.equalsIgnoreCase("STACK")) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        boolean isPalindrome = strategy.isPalindrome(str);

        System.out.println("Is a palindrome? : " + isPalindrome);
    }
}

interface PalindromeStrategy{
    boolean isPalindrome(String input);
}

class StackStrategy implements PalindromeStrategy{
    public boolean isPalindrome(String input){
        Stack<Character> stack = new Stack<>();

        for(char c : input.toCharArray()){
            stack.push(c);
        }

        for(char c : input.toCharArray()){
            if(c != stack.pop())
                return false;
        }

        return true;
    }
}

class DequeStrategy implements PalindromeStrategy{
    public boolean isPalindrome(String input){
        Deque<Character> deque = new ArrayDeque<>();

        for(char c : input.toCharArray()){
            deque.push(c);
        }

        while(deque.size() > 1){
            if(deque.removeFirst() != deque.removeLast())
                return false;
        }
        return true;
    }
}