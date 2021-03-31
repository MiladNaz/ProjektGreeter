package greeter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

public class GreeterTest {

    Greeter greeter = new Greeter();

    @Test
    @DisplayName("Greeting a person")
    void greetingAPerson() {


        var actual = greeter.greet("Johan", LocalTime.parse("12:01"));

        assertEquals("Good day Johan", actual);
    }

    @Test
    @DisplayName("Trimming name")
    void trimmingName() {

        var actual = greeter.greet("   Jonas  ", LocalTime.parse("12:01"));

        assertEquals("Good day Jonas", actual);

    }

    @Test
    @DisplayName("First letter of name to uppercase")
    void firstLetterOfNameToUpperCase(){
        var actual = greeter.greet("sir", LocalTime.parse("12:01"));

        assertEquals("Good day Sir", actual);
    }


}
