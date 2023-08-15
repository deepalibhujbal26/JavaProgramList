package Class8;

public class T4Enhancedloop {
    public static void main(String[] args) {
        //print all even number using this array used Enhanced loop
        //find the largest even no
        int [] nums={10,77,25,56,60,20};
      int  largest=nums[2];
         for(int i:nums)
         {
             if(i>largest && i%2==0) {
                largest=i;
             }
         }
        System.out.println(largest);
    }
}
