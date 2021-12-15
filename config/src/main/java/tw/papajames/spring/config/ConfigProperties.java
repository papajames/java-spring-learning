package tw.papajames.spring.config;

import javax.validation.constraints.NotBlank;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@Configuration
@ConfigurationProperties(prefix = "mail1")
@Validated
public class ConfigProperties {

    @NotBlank
    private String hostName;
    private int port;
    private String from;

    public void setHostName(String hostName){
        this.hostName = hostName;
    }

    public String getHostName() {
        return hostName;
    }

    public void setPort(int port){
        this.port = port;
    }

    public int getPort() {
        return port;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getFrom() {
        return from;
    }
}
