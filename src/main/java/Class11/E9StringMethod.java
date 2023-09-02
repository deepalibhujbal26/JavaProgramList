package Class11;

public class E9StringMethod {
    public static void main(String[] args) {

        // Spilt the string
        String str="Hi There how are you. I am  Good . I am driving ";
       String []strs= str.split("[.]");


        System.out.println(strs.length); // return 3 size of String
        System.out.println(strs[0]);// return first string of given sting
        System.out.println(strs[2].trim());// returns second string and remove extra space.



    }
}
