package Class11;

public class E2String {
    public static void main(String[] args) {
        String str="Batch 17 is great.";

        int lenght=str.length();
        System.out.println(lenght);

      char a =(str.charAt(str.length()/2));
        System.out.println(a);

        System.out.println(str.charAt(str.length()-1)); // it will return last character of string
        int lastIndex=str.length()-1;
        System.out.println(lastIndex);
        char c=str.charAt(lastIndex);
        System.out.println(c);

    }
}
