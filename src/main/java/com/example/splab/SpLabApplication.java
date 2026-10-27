package com.example.splab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.example.splab.difexample.*;

@SpringBootApplication
public class SpLabApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpLabApplication.class, args);

        TransientComponent tc1 = context.getBean(TransientComponent.class);
        TransientComponent tc2 = context.getBean(TransientComponent.class);

        SingletonComponent sc1 = context.getBean(SingletonComponent.class);
        SingletonComponent sc2 = context.getBean(SingletonComponent.class);

        ClientComponent c = context.getBean(ClientComponent.class);
        c.operation();
    }
}