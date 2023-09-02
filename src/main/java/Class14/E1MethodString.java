package Class14;

public class E1MethodString {

    public  static String reversed(String name){
        String reverse="";

        for (int i = name.length()-1;  i>=0 ; i--) {
            reverse=reverse+name.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        E1MethodString obj=new E1MethodString();
        System.out.println("Reversed String is : "+ reversed("Java"));
    }
}
