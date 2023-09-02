package Class14;
public class E2MethodVowels {
    private static String vowels(String name) {
        String vowel = "";
        for (int i = 0; i <name.length() ; i++) {
            if(name.charAt(i) == 'a'||
                    name.charAt(i) == 'e'||
                    name.charAt(i) == 'i'||
                    name.charAt(i) == 'o'||
                    name.charAt(i) == 'u'){
                vowel=vowel+name.charAt(i);
            }
        }
        return vowel;
       // or
     // return name.replaceAll("[^aeiouaAEIOU]"," ");
    }
    public static void main(String[] args) {
        String name ="javaieodfu";
        System.out.println("Given String :"+name);
        System.out.println("Contains vowels  : " + E2MethodVowels.vowels(name));
    }
}
