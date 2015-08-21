package modules;

import org.springframework.stereotype.Component;

@Component
public class MyBeanB {
    public String getMessage() {
        return "I'm a Spring Bean";
    }
}
