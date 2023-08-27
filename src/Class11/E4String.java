package Class11;

public class E4String {
    public static void main(String[] args) {

        String str ="sdrq#$%457";

        System.out.println(str.indexOf('5'));
        // it will return "first" occurence of index vale of char 5 from given string which 8

        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='5')
            {
                count++;
            }
        }
        System.out.println("How many time occured "+ count);
    }
    }
