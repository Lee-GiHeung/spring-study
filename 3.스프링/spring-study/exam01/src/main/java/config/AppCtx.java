package config;

import model.Greeter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {

    @Bean // 관리하는 객체임을 알려주는 어노테이션
    public Greeter greeter() {
        return new Greeter();
    }
}
