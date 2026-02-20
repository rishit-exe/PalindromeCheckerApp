import javax.xml.transform.Source;
import java.util.Scanner;

public class PalindromeCheckerApp {
    static void main() {
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");

        String str = "madam";
        System.out.println("Input text: " + str);

        char[] arr = str.toCharArray();

        int start = 0, end = arr.length - 1;
        boolean isPalindrome = true;
        while(start < end){
            if(arr[start] != arr[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Is a palindrome? : " + isPalindrome);
    }
}
