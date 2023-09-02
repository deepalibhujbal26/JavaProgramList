package Class11;

public class HWStringMethod {
    public static void main(String[] args) {
        String motherName="Deepali";
        String fatherName="Supresh";

        System.out.println("Mothers Name :"+motherName);
        System.out.println("Fathers Name :"+fatherName);
       //String boy="";
       // String girl="";

        int index=motherName.length()/2;
        int index2 =fatherName.length()/2;
        String girl1=motherName.substring(0,index) +fatherName.substring(index2,fatherName.length());
        System.out.println("Girl name :"+ girl1);
        String boy=fatherName.substring(0,index2)+motherName.substring(index,motherName.length());
        System.out.println("Boy Name :"+boy);


















    }
}
