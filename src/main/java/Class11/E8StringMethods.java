package Class11;

public class E8StringMethods {
    public static void main(String[] args) { // Regular Expersion
        // Website we can learnn  regerxr.com

        String str="fgdffg      jk6ASDFF56676@#$";
        String str1=str.replaceAll("[A-Z]","=");//replace uppercase letter A-Z with =
        System.out.println(str1);
        System.out.println(str.replaceAll("[A-C]","=")); //REPLACE uppercase letter from A-C WITH ==

        System.out.println(str.replaceAll("[a-z]",""));// replace a-z with =

        System.out.println(str.replaceAll(" ","")); // remove space
        System.out.println(str.replaceAll("[A-z]","!")); //replace A to z with !
        System.out.println(str.replaceAll("[&-;]","")); // replace & to ; with ""

        System.out.println(str.replaceAll("[A-Z0-58-9A]",""));
        System.out.println(str.replaceAll("\\d",""));

        System.out.println(str.replaceAll("[^A-Z]","")); // REMOVE EVERYTHINK EXCEPT A-Z
        System.out.println(str.replaceAll("[^A-Z0-58-9A]",""));// remove eveeythink except all a-z number
         // ^ this symbol is used as not symbol(!)




        


    }
}