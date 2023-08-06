package Class5;

public class E8ANDop {
    public static void main(String[] args) {
        boolean goodCredit=true;
        boolean stableJob=true;
        boolean minimumAge=false;
        if(goodCredit&&stableJob&&minimumAge) {
            System.out.println("You can have the loan");
        }
        else {
            System.out.println("you need to fulfill  all the requirement");
        }
    }
}
