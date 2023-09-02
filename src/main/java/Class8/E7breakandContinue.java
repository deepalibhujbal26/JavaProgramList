package Class8;

public class E7breakandContinue {
    public static void main(String[] args) {

        //you have to search array for number 45 it is present print found

        int[]nums={10,23,25,56,45,20};
        for(int i=0;i<nums.length;i++){
            if(nums[i]==45){
                System.out.println("found");
                break;
            }
        }

    }
}
