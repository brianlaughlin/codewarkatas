package kata.kyu8.welcome;

import java.util.HashMap;
import java.util.Map;

public class Welcome {
    public static String greet(String language){

        Map<String, String> pickWelcome = new HashMap<>();
        pickWelcome.put("english", "Welcome");
        pickWelcome.put("dutch", "Welkom");
        pickWelcome.put("czech", "Vitejte");
        pickWelcome.put("danish", "Velkomst");
        pickWelcome.put("estonian", "Tere tulemast");
        pickWelcome.put("finnish", "Tervetuloa");
        pickWelcome.put("flemish", "Welgekomen");
        pickWelcome.put("french", "Bienvenue");
        pickWelcome.put("german", "Willkommen");
        pickWelcome.put("irish", "Failte");
        pickWelcome.put("italian", "Benvenutot");
        pickWelcome.put("latvian", "Gaidits");
        pickWelcome.put("lithuanian", "Laukiamas");
        pickWelcome.put("polish", "Witamy");
        pickWelcome.put("spanish", "Bienvenido");
        pickWelcome.put("swedish", "Valkommen");
        pickWelcome.put("welsh", "Croeso");
        pickWelcome.put("IP_ADDRESS_NOT_FOUND", "Welcome");
        pickWelcome.put("IP_ADDRESS_REQUIRED", "Welcome");
        pickWelcome.put("IP_ADDRESS_INVALID", "Welcome");

        return pickWelcome.get(language);
    }
}
