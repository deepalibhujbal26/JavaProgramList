package Class11;

public class HW5 {
    /*
    How would you check if String is palindrome or not? aba=> true
     Abbc =>false
     */

    public static void main(String[] args) {
        String name= "abbc";
        char first =name.charAt(0);
        //System.out.println(first);

        char last=name.charAt(name.length()-1);
      //  System.out.println(last);
        System.out.println("Given String :"+ name);

          if(first==last){
              System.out.println("its a palindrome");
          }
          else{
              System.out.println("its not palindrome");
          }
    }
}
