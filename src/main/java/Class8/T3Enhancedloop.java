package Class8;

public class T3Enhancedloop {
    public static void main(String[] args) {  //largest value from given array
        int [] nums={10,23,25,56,45,20};
        int largest=nums[0];
        for(int n :nums){
            if(n>largest){
                largest=n;
            }

        }
        System.out.println(largest);



    }
}
