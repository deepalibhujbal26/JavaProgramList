package Review10;

public class Car  implements Washable{
    public void drive(){
        System.out.println("Driving...........");
    }

    @Override
    public void wash() {
        System.out.println("you can take car to wash");
    }
}
class Horse implements Washable{


    @Override
    public void wash() {
        System.out.println("horse can wash themselves");
    }
}
