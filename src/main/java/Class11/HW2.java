package Class11;

public class HW2 {

    /*
    Create a String that should be combination of letters, numbers and special
    characters. Find out how many Alphabets(abd AZ) characters are there in the String.
     */
    public static void main(String[] args) {
        String str= "dfgfgfADDSDSFS456565#$%&*@";

        System.out.println("Given String :"+ str);
        String [] str1= str.split("[A-Z]");
        System.out.println("UpperCaseAlphbet : "+ str1.length);

        String [] str2=str.split("[a-z]");
        System.out.println("lowercase letter : " + str2.length);

        String [] str3=str.split("[A-z]");
        System.out.println("All Case letter : " + str3.length);






    }
}
