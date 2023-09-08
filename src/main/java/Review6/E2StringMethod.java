package Review6;

public class E2StringMethod {
    public static void main(String[] args) {
        String str="This is a java class";

        System.out.println(str.startsWith("t")); //start
        System.out.println(str.endsWith("class"));//end
        System.out.println(str.contains("java"));  //contains java in given string
        System.out.println(str.indexOf('a')); //
        System.out.println(str.charAt(5));
        System.out.println("1"+str.equals("java"));
        System.out.println(str.replaceAll("java","jaaavaaaa"));
//        String  a[] =str.split(" ");
//        for (int i = 0; i <a.length ; i++) {
//            System.out.println(a[i]);
//
//        }

        char array[]=str.toCharArray(); // return string in char array
        for (char names:array) {
            System.out.println(names);

        }
        String text = "apple,banana,orange";
        String [] fruits =text.split(","); // return the string in array form which is separed by ,
        for (String names:fruits) {
            System.out.println(names);

        }
        System.out.println(str.substring(0,str.length()/2));






    }
}
