package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pojo.User;

@Configuration
public class AppConfig {

    @Bean(name = "User")
    public User initUser() {
        User user = new User();
        user.setId(1L);
        user.setNote("note_1");
        user.setUserName("user_name");
        return user;
    }
}
