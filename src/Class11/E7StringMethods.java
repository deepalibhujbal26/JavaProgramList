package Class11;

public class E7StringMethods {
    public static void main(String[] args) {
        String str="fgdffg      jk6ASDFF56676@#$";
        String str1=str.replaceAll("[A-Z]","=");
        System.out.println(str1);
        System.out.println(str.replaceAll("[A-C]","="));

        System.out.println(str.replaceAll("[a-z]",""));  // it will remove that char.

        System.out.println(str.replaceAll(" ",""));
        System.out.println(str.replaceAll("[A-z]","!"));
        System.out.println(str.replaceAll("[&-;]",""));




    }
}