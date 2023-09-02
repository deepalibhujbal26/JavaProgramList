package Class8;

public class E6Enhancedloop {
    public static void main(String[] args) {
        //Replace the value of num as 0 if number is greater than 20 the print using enhanced loop

        int [] nums={10,77,25,56,60,20};
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>20){
                nums[i]=0;
            }
        }
        for (int i = 0; i <nums.length ; i++) {
            System.out.println(nums[i]);

        }

    }
}
