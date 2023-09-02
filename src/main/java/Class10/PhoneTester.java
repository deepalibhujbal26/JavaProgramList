package Class10;

public class PhoneTester {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.model="Iphone";
        phone.price=800;
        phone.speed="5G";
        System.out.println("Phone Test");
        System.out.println("Model "+ phone.model);
        System.out.println("Price "+phone.price);
        System.out.println("Speed "+phone.speed);
        phone.camera();
        phone.picture();

        Phone samsung = new Phone();
        samsung.model="S23 Ultra";
        samsung.price=699;
        samsung.speed="4G";
        System.out.println("Phone Test");
        System.out.println("Model "+ samsung.model);
        System.out.println("Price "+samsung.price);
        System.out.println("Speed "+samsung.speed);
        samsung.camera();
        samsung.picture();


    }
}
