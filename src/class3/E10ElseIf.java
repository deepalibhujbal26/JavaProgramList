package class3;

public class E10ElseIf {
    public static void main(String[] args) {

        String fruit="Apple";
       // if(fruit=="mango")
        if(fruit.equals("Mango"))
        {
            System.out.println("its mango price is $230");
        }
        else if(fruit.equals("Orange"))
        {
            System.out.println("its orange price is $23");

        }
        else if (fruit.equals("grapes"))
        {
            System.out.println("its grapes price is $245");

        }
        else if (fruit.equals("kiwi"))
        {
            System.out.println("its kiwi price is $54");


        }
        else if(fruit.equals("Apple"))
        {
            System.out.println("its apple price is $23");

        }
        else
        {
            System.out.println("this fruit is not availble");

        }

    }
}
