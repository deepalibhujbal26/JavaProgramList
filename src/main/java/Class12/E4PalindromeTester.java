package Class12;

import java.util.Scanner;

public class E4PalindromeTester {
    public static void main(String[] args) {

        E4Palindrome obj = new E4Palindrome();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string : ");
        String name = scanner.next();
        System.out.println("String :" + name);
        boolean isPalindrome = obj.isPalindrome(name);
        if (isPalindrome) {
            System.out.println(name + " is palindrome");
        } else {
            System.out.println(name + " its not palindrome");
        }
    }
}
