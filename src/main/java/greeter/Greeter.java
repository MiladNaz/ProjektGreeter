package greeter;

import org.apache.commons.lang3.StringUtils;

public class Greeter {

    public  String greet(String name) {



        return "Hello " + StringUtils.trim(name);


    }
}
