package Class11;

public class HWReverserWord {
    public static void main(String[] args) {
        String str= "This is sentence i want to reverse";

        String []array=str.split(" ");
        for (int i = 0; i < array.length ; i++) {
            String word=array[i];
            String reversed=reversedString(word);
            System.out.print(reversed+" ");

        }
        //System.out.println(reversedString(array[0]));


    }

    static String reversedString(String input){
        String reversedWord="";

        for (int i = input.length()-1; i>=0 ; i--) {
            reversedWord=reversedWord+input.charAt(i);

        }
       return reversedWord;
    }
}
