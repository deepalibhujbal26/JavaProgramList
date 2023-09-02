package Class14;
public class Sum {

     int sum(int array[]){
         int sum= 0;

         for (int i = 0; i <array.length ; i++) {
             sum=sum+array[i];
         }
         return  sum;
    }
    public static void main(String[] args) {
          Sum s1=new Sum();
            int newArray[]={12,34,56,78};
          System.out.println("Sum of array value is  "+ s1.sum(newArray));
    }
}
