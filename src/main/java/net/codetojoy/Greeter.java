
package net.codetojoy;

import java.util.*;

// silly class to use as an illustration

public class Greeter {
    private final static String HELLO = "hello";
    private final static String GREETINGS_BUNDLE = "greetings";

    protected Locale getLocale(String lang) {
        Locale result = Locale.ENGLISH;

        if ((lang != null) && (! lang.trim().isEmpty())) {
            result = new Locale(lang);
        }

        return result;
    }

    public String greet(String lang) {
        Locale locale = getLocale(lang);
        ResourceBundle greetings = ResourceBundle.getBundle(GREETINGS_BUNDLE, locale); 
        String result = greetings.getString(HELLO);

        return result;
    }
}
