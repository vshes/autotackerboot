package io.shesh.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Created by shesh on 6/29/17.
 */
@SpringBootApplication
@Import({SwaggerConfig.class,EmailConfig.class})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
