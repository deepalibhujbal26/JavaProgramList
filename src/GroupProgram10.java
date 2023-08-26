public class GroupProgram10 {

    /*
    Write a program to print out duplicate elements from an Array of
    Strings?
     */

        public static void main(String[] args) {
            String [] name = {"Deepali", "Ashika", "Ayesha", "Ayesha", "Guilia", "Ehab", "Jamel", "Ashika","Guilia","Ayesha"};
            String allNames = "";
            String duplicateNames = "";

            for (int i =0; i< name.length; i++) {
                allNames = allNames + "-" + name[i];
            }

            for (int i=0; i<name.length; i++) {
                int firstOccurrence = allNames.indexOf(name[i]);
                if (firstOccurrence > 0) {
                    String allNamesAfterFirstOccurrence = allNames.substring(firstOccurrence + name[i].length(), allNames.length());
                    if (!duplicateNames.contains(name[i])) {
                        System.out.println(name[i]);
                    }

                    if (allNamesAfterFirstOccurrence.contains(name[i])) {
                        duplicateNames = duplicateNames + "-" + name[i];
                    }
                }
            }
        }
    }


