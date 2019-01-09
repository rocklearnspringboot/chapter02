package config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojo.User;

import java.util.logging.Logger;

public class ToCTest2 {
    private static String name = "ToCTest";

    private static Logger log = Logger.getLogger(ToCTest2.name);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = ((AnnotationConfigApplicationContext) ctx).getBean(User.class);
        log.info(user.getUserName());
        String name = log.getName();
        log.info(name);
    }
}
