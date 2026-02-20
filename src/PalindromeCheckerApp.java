import javax.xml.transform.Source;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    static void main() {
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");

        String str = "civic";
        System.out.println("Input text: " + str);

        Queue<Character> queue = new LinkedList<>();

        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()){
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;

        while(!queue.isEmpty()){
            if(queue.remove() != stack.pop()){
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is a palindrome? : " + isPalindrome);
    }
}
