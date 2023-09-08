package Review7;

public class StringReview {
    public static void main(String[] args) {
        //Multiple ways of writing string

        String phone = "iPhone";

        String color = new String();
        color = "yellow";

        String day = new String("Monday");

        String sentence = "Today is September 7"; // string is imutable
        System.out.println(sentence.length());
        System.out.println(sentence.trim().length());
        String arr[] = sentence.split(" ");
//        for (int i = 0; i <arr.length ; i++) {
        //   System.out.println(arr[i].length());

        // }
        System.out.println(arr[0]);

        String newSe = sentence.replace("today", "tomorrow");
        System.out.println(newSe);

        String str1="Hi hi Friends";
        str1= str1.replace("hi","Hello");
        System.out.println(str1);
       str1= str1.replaceFirst("Hello","Bye");
        System.out.println(str1);
        str1=str1.replaceAll("Hello","bye");
        System.out.println(str1);




    }
}
