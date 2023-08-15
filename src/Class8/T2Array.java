package Class8;

public class T2Array {
    public static void main(String[] args) {
        int [] numbers={10,20,4,3,8,45,96};

        //count numbers greater than 10 in array   answer is=3
        int count=0;
        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i]>10){
                 count=count+1;
            }
        }
        System.out.println(count);

    }
}
