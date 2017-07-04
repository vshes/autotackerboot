package io.shesh.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.AbstractEnvironment;

/**
 * Created by shesh on 6/29/17.
 */
@SpringBootApplication
@Import({SwaggerConfig.class,EmailConfig.class})
public class Application {

    public static void main(String[] args) {

        System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME,"prod");
        SpringApplication.run(Application.class);
    }
}
