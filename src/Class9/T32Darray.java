package Class9;

public class T32Darray {
    public static void main(String[] args) {
        String[][] students={{"Ayesha","Giulia","John","Deepali"}, //print name whos grades are A or B
                {"A","A+","C","B"}};

        for (int i = 0; i <4 ; i++)   // for(int i=0;i<students[0).length
        {
            if(students[1][i].equals("A")||students[1][i].equals("B")) {

                    System.out.print(students[0][i] + " ");

            }
        }



    }
}
