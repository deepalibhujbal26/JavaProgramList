       package Class9;

public class HW4 {
    public static void main(String[] args) {
        String[][] countries = {{"Canada", "United States", "Mexico", "Greenland", "Guatemala"},
                {"Argentina", "Bolivia", "Brazil", "Chile", "Colombia"},
                {"Albania", "Andorra", "Austria", "Belarus", "Belgium"},
                {"India", "Indonesia", "Iran", "Iraq", "Israel"},
                {"Algeria", "Angola", "Benin", "Botswana", "Burundi"}};

        int totalCountries = 0;
        System.out.println("ALl countries name");
        for (int i = 0; i < countries.length; i++) {

            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j] + " ");
            }
            totalCountries = totalCountries + countries[i].length;
            System.out.println();
        }
        System.out.println("Total Countries count is " + totalCountries);

     int total=0;
        for(String[] r : countries){
            for (String r1 :r)
            {
                total++;

            }


        }
        System.out.println(total);
    }
}
