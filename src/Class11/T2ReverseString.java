package Class11;

public class T2ReverseString {

    public static void main(String[] args) {
        String str="Sunday";

       // String reversed[]=;
        System.out.println("Original String  : "+ str);  //Reverse String
        for (int i = str.length()-1; i>=0 ; i--) {

            System.out.print(str.charAt(i) + " ");
        }




    }
}
