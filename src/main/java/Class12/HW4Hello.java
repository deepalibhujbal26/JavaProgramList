package Class12;

public class HW4Hello {

    String country(String countryName){

        if(countryName.equalsIgnoreCase("India")){
            return "Namaste";
        }
        else if(countryName.equalsIgnoreCase("Usa")){
            return "hello";
        }
        else if(countryName.equalsIgnoreCase("Mexico")){
            return "Hola";
        }
        else if(countryName.equalsIgnoreCase("Italy")){
            return "Ciao";
        }
        else {
            return "Sorry  I Don't Know";
        }

    }
}
