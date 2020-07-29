package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application  {

    // Приложение работает, если его поднять отдельно от этого проекта. Видимо, проблема
    // заключается в том,что проект тянет настройки общего pom.xml
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}