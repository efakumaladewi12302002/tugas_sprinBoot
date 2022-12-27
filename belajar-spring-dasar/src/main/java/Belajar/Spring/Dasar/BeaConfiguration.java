package Belajar.Spring.Dasar;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class BeaConfiguration {
    @Bean
    public Foo foo() {
        Foo foo = new Foo();
        log.info("creat new foo");
        return foo;
    }
}
