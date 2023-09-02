package Class12;

public class E4Palindrome {

    boolean isPalindrome(String name){

        String revString="";

        for (int i = name.length()-1; i>=0 ; i--) {
            revString=revString+name.charAt(i);
        }

        System.out.println("Reversed String  : "+ revString);

        if(name.equals(revString))
        {
            return true;
        }
        else {
            return false;
        }

       // return true;
    }
}
