package Class8;

public class E4Enhancedloop {
    public static void main(String[] args) {     //Count the array who's value is greater than 20 ushing enhanced loop
        int [] nums={10,23,25,56,45,20};
        int count=0;

         for(int  t : nums) {
             if (t > 20 ) {
                 count++;
             }
         }
        System.out.println(count);



    }
}
