package greeter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Greeter greeter = new Greeter();

        System.out.println(greeter.greet("Milad"));

    }
}
