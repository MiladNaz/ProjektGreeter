package greeter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

    @ParameterizedTest
    @CsvSource({"12:00,Milad,Good day Milad","18:00,Johan,Good evening Johan","22:00,Edvin,Good night Edvin","06:00,Jonas,Good morning Jonas"})
    @DisplayName("Different greetings at different time of day")
    void time(String localTime, String name, String expected){

        var actual = greeter.greet(name,LocalTime.parse(localTime));

        assertEquals(expected, actual);

    }


}
