package greeter;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        Greeter greeter = new Greeter();

        System.out.println(greeter.greet("   Martin   ", LocalTime.now()));

    }
}
