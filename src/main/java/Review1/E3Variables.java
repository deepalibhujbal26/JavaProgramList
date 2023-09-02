package Review1;

public class E3Variables {
    public static void main(String[] args) {
        int age, price, noOfFans;
        age = 15;
        price = 24;
        noOfFans = 4;
        String op1 = age + " ";
        String op2 = op1 + price;
        String op3 = op2 + noOfFans;
        System.out.println(age + " " + price + noOfFans);
        //its go left to right age+space then concat
        System.out.println(op3);

        System.out.println(age + price + "" + noOfFans);
        //first additon happend then string concat left to right

        System.out.println((age + price) + " " + (noOfFans + price));
        System.out.println(12 + " " + 5 * 5);//priority to perform multiplication

        int size = 10, noOfCars = 4, noOfTires = 4; //another way of creating varible


    }
}
