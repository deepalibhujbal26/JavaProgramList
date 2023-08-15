package Class8;

public class E6Enhancedloop {
    public static void main(String[] args) {
        //print all even number using this array used Enhanced loop
        //find the largest even no
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
