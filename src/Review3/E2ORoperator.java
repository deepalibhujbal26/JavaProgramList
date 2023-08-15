package Review3;

public class E2ORoperator {
    public static void main(String[] args) {
        boolean isMeat=true;
        boolean isEgg=true;

        boolean isFish=true;


        boolean milk=true;
        boolean vegetables=false;

        boolean isProtein=isEgg||isMeat||isFish;
        System.out.println(isProtein);

        boolean isGoodDiet=milk && (isEgg||isMeat||isFish) &&vegetables;
        System.out.println(isGoodDiet);
    }
}
