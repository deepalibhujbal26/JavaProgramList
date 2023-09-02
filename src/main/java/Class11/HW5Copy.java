package Class11;

public class HW5Copy {
    /*
    How would you check if String is palindrome or not? aba=> true
     Abbc =>false
     */

    public static void main(String[] args) {
        String name= "nitin";
        String revName="";
        System.out.println("Original String is :" +name);

        for (int i = name.length()-1; i>=0 ; i--) {
           // System.out.print(name.charAt(i)+" ");
            revName=revName+name.charAt(i);
        }
        System.out.println("ReverseString : "+ revName);

        if(name.equals(revName)){
            System.out.println("its an palindrome");
        }
        else {
            System.out.println("its not palindrome");
        }



    }
}
