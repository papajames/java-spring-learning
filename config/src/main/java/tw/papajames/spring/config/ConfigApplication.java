package tw.papajames.spring.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties(ImmutableConfigProperties.class)
public class ConfigApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext app = SpringApplication.run(ConfigApplication.class, args);

        ConfigProperties config = app.getBean(ConfigProperties.class);
        System.out.printf("[NORMAL] host: %s, port: %d, from: %s\n", config.getHostName(), config.getPort(), config.getFrom());

        ImmutableConfigProperties immutable = app.getBean(ImmutableConfigProperties.class);
        System.out.printf("[IMMUTABLE] host: %s, port: %d, from: %s", immutable.getHostName(), immutable.getPort(), immutable.getFrom());
    }

}
