package greeter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class GreeterTest {

    Greeter greeter = new Greeter();

    @Test
    @DisplayName("Greeting a person")
    void greetingAPerson() {


        var actual = greeter.greet("Johan");

        assertEquals("Hello Johan", actual);
    }

    @Test
    @DisplayName("Trimming name")
    void trimmingName() {

        var actual = greeter.greet("  Edvin Jonas  ");

        assertEquals("Hello Edvin Jonas", actual);


    }


}
