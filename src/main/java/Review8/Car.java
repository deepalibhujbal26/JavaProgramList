package Review8;

public class Car {
    private String make;
    private String model;
    public Car(String make,String model){
        this.make=make;
        this.model=model;

    }
    public Car(){

        System.out.println("1");
        System.out.println("2");
        System.out.println("3");

    }
     public Car(int year){
        this();

     }


    public static void main(String[] args) {
        Car obj=new Car("toyotA","COROLLA");
    }

}

