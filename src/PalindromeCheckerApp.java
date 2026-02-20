import javax.xml.transform.Source;
import java.util.Scanner;

public class PalindromeCheckerApp {
    static void main() {
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");

        String str = "madam";
        System.out.println("Input text: " + str);

        String revStr = "";
        for(int i = str.length() - 1; i >= 0; i--){
            revStr += str.charAt(i);
        }

        System.out.println("Is a palindrome? : " + str.equals(revStr));
    }
}
