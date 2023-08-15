package Class8;

public class T5Enhancedloop {
    public static void main(String[] args) {
        //find the smallest no
        int[]nums={10,77,25,56,60,20,-10,-5};
         int small= nums[0];
         for(int i :nums)
         {
             if(i<small)
             {
                small=i;
             }
         }
        System.out.println(small);


    }
}
