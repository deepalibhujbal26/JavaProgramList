package Class19;

public class MinimumNumber {

    // create method to find minimum numbers . method will be passed two param
   // and will return minimum number. method should work with int and double data types.

    public int minimumNum(int num1,int num2){
        if(num1<num2){
            return num1;
        }
        else {
            return num2;
        }
    }

   // or Ternary operator short cut   =  return num1<num2? num1 :num2;
    public double minimumNum(double num1,double num2){
        if(num1<num2){
            return num1;
        }
        else {
            return num2;
        }
    }
}
