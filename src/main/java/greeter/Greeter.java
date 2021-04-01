package greeter;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalTime;

public class Greeter {

    public  String greet(String name, LocalTime timeNow) {

        name = StringUtils.trim(name);
        String greeting;

        if(timeNow.isAfter(LocalTime.parse("05:59")) && timeNow.isBefore(LocalTime.parse("12:00"))){
            greeting = "Good morning ";
        }else if(timeNow.isAfter(LocalTime.parse("17:59")) && timeNow.isBefore(LocalTime.parse("22:00"))){
            greeting = "Good evening ";
        }else if(timeNow.isAfter(LocalTime.parse("21:59")) || timeNow.isBefore(LocalTime.parse("06:00"))){
            greeting = "Good night ";
        }else {
            greeting = "Good day ";
        }

        return greeting + name.substring(0,1).toUpperCase() + name.substring(1);

    }
}
