package greeter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GreeterTest {

    @Test
    @DisplayName("Greeting a person")
    void greetingAPerson() {
        Greeter greeter = new Greeter();

        var actual = greeter.greet("Johan");

        assertEquals("Hello Johan", actual);
    }
}
