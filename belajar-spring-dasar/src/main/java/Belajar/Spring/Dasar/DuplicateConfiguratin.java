package Belajar.Spring.Dasar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DuplicateConfiguratin {

    @Bean
    public Foo foo1(){
        return  new Foo();
    }
    @Bean
    public  Foo foo2(){
        return  new Foo();
    }
}
