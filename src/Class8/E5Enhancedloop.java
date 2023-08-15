package Class8;

public class E5Enhancedloop {
    public static void main(String[] args) {

        //print all even number using this array used Enhanced loop
        int [] nums={10,23,25,56,45,20};
       //int even=nums[2];
         for(int i:nums)
         {
             if(i%2==0)
             {
                 System.out.println(i);
             }
         }

    }
}
