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

            int small= nums[0];     ///find the smallerst even no in array
          for(int j:nums){
           if(j<small & j%2==0){
           small =j;
           }
          }
        System.out.println(small);


          for(int i=0;i<nums.length;i++){       /// print the number who index is even number
              if(i%2==0){
                  System.out.print(nums[i]+" ");
              }
          }
    }
}
