package Class11;

public class E3String {
    public static void main(String[] args) {
        String str="Batch 17 is  A great.";   // count "a" character how many times is present in string
            int count =0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='a'|| str.charAt(i)=='A') //
            {
                count++;
            }

        }
        System.out.println(count);

    }

}
