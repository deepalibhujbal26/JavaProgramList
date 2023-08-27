package Class11;

public class HW4 {
    /*
    How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever

     */
    public static void main(String[] args) {
        String input = "This is sentence i want to reverse";
        System.out.println("Given String :" + input);

        String[] array = input.split(" ");
        String reverseString = "";

        for (String a : array) {
            String rev = "";
            for (int i = a.length() - 1; i >= 0; i--) {
                rev = rev + a.charAt(i);
            }
            reverseString = reverseString + rev + " ";
        }

        System.out.println(reverseString);

     /*   for (int i = 0; i <array.length ; i++) {
            String rev="";
            for (int j = array[i].length()-1; j>=0 ; j--) {
                rev=rev+array[i].charAt(j);

            }
            reverseString=reverseString+rev+" ";

        }
        System.out.println(reverseString); */
    }

}



