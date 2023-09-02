package Class4;

public class E2NestedIf {
    public static void main(String[] args) {
        boolean winter=true;

        String jacketColor="Blue";

        if(winter==true)
        {
            if(jacketColor.equals("Red"))
            {
                System.out.println("Lets go with Red Nike SHoes");
            }
            else
            {
                System.out.println("its an Blue shoes");
            }
        }
        else
        {

            System.out.println("no need to wear jacket");
        }

    }
}
