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

        PalindromeStrategy stackStrategy = new StackStrategy();
        PalindromeStrategy dequeStrategy = new DequeStrategy();

        long startStack = System.nanoTime();
        boolean stackResult = stackStrategy.isPalindrome(str);
        long endStack = System.nanoTime();

        long startDeque = System.nanoTime();
        boolean dequeResult = dequeStrategy.isPalindrome(str);
        long endDeque = System.nanoTime();

        long execTimeStack = endStack - startStack;
        long execTimeDeque = endDeque - startDeque;

        System.out.println("\nIs a palindrome? (Stack): " + stackResult);
        System.out.println("Execution time: " + execTimeStack + " ns");

        System.out.println("\nIs a palindrome? (Deque): " + dequeResult);
        System.out.println("Execution time: " + execTimeDeque + " ns");

        if(execTimeStack < execTimeDeque)
            System.out.println("\nStackStrategy is better");
        else
            System.out.println("\nDequeStrategy is better");
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