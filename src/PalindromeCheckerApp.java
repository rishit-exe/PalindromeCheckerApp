import javax.xml.transform.Source;
import java.util.*;

public class PalindromeCheckerApp {
    static void main() {
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");

        String str = "A man a plan a canal Panama";
        System.out.println("Input text: " + str);

        String normalizedStr = "";
        for(char c : str.toCharArray()){
            if(c != ' ')
                normalizedStr += c;
        }

        normalizedStr  = normalizedStr.toLowerCase();
        boolean isPalindrome = check(normalizedStr, 0, normalizedStr.length() - 1);


        System.out.println("Is a palindrome? : " + isPalindrome);
    }

    private static boolean check(String s, int start, int end){
        if(start >= end)
            return true;
        if(s.charAt(start) != s.charAt(end))
            return false;

        return check(s, start + 1, end - 1);
    }
}
