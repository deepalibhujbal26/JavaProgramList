package Class11;

public class E11StringMethod {
    public static void main(String[] args) {
        String str="Hi#There#How#are#you";

        String[]str1= str.split("[#]"); // it will split string from # symbol
        System.out.println(str1.length);
    }
}
