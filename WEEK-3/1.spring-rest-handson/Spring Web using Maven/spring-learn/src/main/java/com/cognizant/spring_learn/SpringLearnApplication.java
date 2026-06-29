package com.cognizant.spring_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //Magic annotation: enables auto-config + component scan
public class SpringLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringLearnApplication.class, args);
        // ↑ This does 3 things:
        // 1. Creates the ApplicationContext (IoC container)
        // 2. Performs Auto-Configuration
        // 3. Starts embedded Tomcat on port 8080
    }

}
