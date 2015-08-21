package modules;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.guice.module.SpringModule;

public class MySpringModule extends SpringModule {
    public MySpringModule() {
        super(new AnnotationConfigApplicationContext(AppConfig.class));
    }
}
