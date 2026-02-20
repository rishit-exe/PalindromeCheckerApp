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

        boolean isPalin = true;
        for(int i = 0; i < str.length() / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]){
                isPalin = false;
                break;
            }
        }

        System.out.println("Is it a palindrome? : " + isPalin);
    }
}
