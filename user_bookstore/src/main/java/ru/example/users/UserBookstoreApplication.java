package ru.example.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication( scanBasePackages = "ru.example.users" )
@EnableSwagger2
public class UserBookstoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserBookstoreApplication.class, args);
    }

}
