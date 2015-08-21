package modules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyBeanA {
    @Autowired
    private MyBeanB myBeanB;

    public String getMessage() {
        return myBeanB.getMessage();
    }
}
