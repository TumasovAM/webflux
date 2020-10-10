package ru.webflux.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("ru.webflux.producer")
@SpringBootApplication
public class ProducerApplication {

    public static void main(String[] agrs) {
        SpringApplication.run(ProducerApplication.class, agrs);
    }

}
