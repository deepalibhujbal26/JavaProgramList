package Class9;

public class E92DEnhanceloop {
    public static void main(String[] args) {
        String[][]names=
                {       {"Hind","Mikhail","Ismael","Ahmed"},
                        {"John","Bob","Adam","Tamim"},
                        {"Joke","Laugh","ritvi","Deepali"},
                        {"Pushpa","Pallavi","Uma","USha"}
                };

        for(String [] name: names){
            for(String col :name){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
