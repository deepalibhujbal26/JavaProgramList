package Class8;

public class E11Enhanceloop {

    // write program to print the value of index whos index is even no using Enhance loop
    public static void main(String[] args) {

         int [] numbers={12,34,56,76,78,45,41};
         int index=0;
           for(int i:numbers){

               if(index%2==0){
                   System.out.println(i);
               }
               index++;

           }
    }
}
