package Class10;

public class CarTester {
    public static void main(String[] args) {
        Car car=new Car();
        System.out.println("Car Information");
        car.model="Tesla";
        car.year=2020;
        car.price=85000;
        car.color="Black";

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.color);


        car.capacity();

        car.automatic();

        System.out.println("******");
        Car Honda=new Car();
        System.out.println("Car Information");
        Honda.model=" honda Hi11";
        Honda.year=2021;
        Honda.price=45000;
        Honda.color="Red";

        System.out.println(Honda.model);
        System.out.println(Honda.year);
        System.out.println(Honda.price);
        System.out.println(Honda.color);
        car.capacity();
        car.automatic();


    }
}
