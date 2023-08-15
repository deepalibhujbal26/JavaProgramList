package Class8;

public class T1Array { ///count the "true" value from array
    public static void main(String[] args) {
        boolean[] conds={true,false,true,false,true,true};
        int count=0;
        for (int i = 0; i <conds.length ; i++) {

            if(conds[i]==true){     //// or we can just write if(condos[i])
             count= count+1;
            }
        }
        System.out.println(count);
    }
}
