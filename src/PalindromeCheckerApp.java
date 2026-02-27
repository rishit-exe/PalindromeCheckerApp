import javax.xml.transform.Source;
import java.util.*;

public class PalindromeCheckerApp {
    static void main() {
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");

        String str = "racecar";
        System.out.println("Input text: " + str);

        PalindromeService palinService = new PalindromeService();
        boolean isPalindrome = palinService.checkPalindrome(str);

        System.out.println("Is a palindrome? : " + isPalindrome);
    }
}

class PalindromeService{

    public boolean checkPalindrome(String input){
        int start = 0;
        int end = input.length() - 1;

        while(start < end){
            if(input.charAt(start) != input.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
