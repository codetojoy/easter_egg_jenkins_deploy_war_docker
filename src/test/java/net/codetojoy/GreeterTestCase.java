
package net.codetojoy;

import java.util.*;

import org.junit.*;
import static org.junit.Assert.*;

public class GreeterTestCase {
    @Test
    public void testGetLocale_Null() {
        Greeter greeter = new Greeter();

        // test
        Locale result = greeter.getLocale(null);

        assertEquals(Locale.ENGLISH, result);
    }

    @Test
    public void testGetLocale_Empty() {
        Greeter greeter = new Greeter();

        // test
        Locale result = greeter.getLocale("   ");

        assertEquals(Locale.ENGLISH, result);
    }

    @Test
    public void testGetLocale_French() {
        Greeter greeter = new Greeter();

        // test
        Locale result = greeter.getLocale("fr");

        assertEquals(Locale.FRENCH, result);
    }
}
